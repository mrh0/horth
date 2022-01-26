package com.mrh0.horth.output.instructions.high.branching;

import com.mrh0.horth.ast.nodes.branching.TIf;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.HighLabel;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.IExpanding;
import com.mrh0.horth.typechecker.*;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.ArrayList;
import java.util.List;

public class HBIf extends HighInst implements ISpecialCheck, IExpanding {
    private final List<List<HighInst>> conditions;
    private final List<List<HighInst>> doBlocks;
    private List<HighInst> elseBlock;

    public HBIf(TIf tok) throws HorthException {
        super(tok);
        this.conditions =  new ArrayList<>();
        IExpanding.expandBlock(tok.conditions, this.conditions);
        this.doBlocks = new ArrayList<>();
        IExpanding.expandBlock(tok.doBlocks, this.doBlocks);
        if(tok.elseBlock != null) {
            elseBlock = new ArrayList<>();
            tok.elseBlock.expand(elseBlock);
        }
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        if(conditions.size() == 1 && elseBlock == null) {
            IExpanding.expandAll(conditions.get(0), space);
            HighLabel label = new HighLabel();
            space.add(new HBranch(token, label));
            IExpanding.expandAll(doBlocks.get(0), space);
            space.add(label);
        }
        /*else if(conditions.size() == 1) {
            IExpanding.expandAll(conditions.get(0), space);
            HighLabel labelElse = new HighLabel();
            HighLabel label = new HighLabel();
            space.add(new HBranch(token, labelElse));
            IExpanding.expandAll(doBlocks.get(0), space);
            space.add(new HJump(label));
            space.add(labelElse);
            IExpanding.expandAll(elseBlock, space);
            space.add(label);
        }*/
        else {
            HighLabel label = new HighLabel();
            for(int i = 0; i < conditions.size(); i++) {
                IExpanding.expandAll(conditions.get(i), space);
                HighLabel labelElse = new HighLabel();
                space.add(new HBranch(token, labelElse));
                IExpanding.expandAll(doBlocks.get(i), space);
                space.add(new HJump(label));
                space.add(labelElse);
            }
            if(elseBlock != null) {
                IExpanding.expandAll(elseBlock, space);
            }
            space.add(label);
        }
    }

    @Override
    public void check(VirtualStack stack) throws HorthException {
        VirtualStack snapshot1 = stack.snapshot();

        for(List<HighInst> cond : conditions) {
            TypeChecker.check(stack, cond);
            stack.check(token, AllTypes.BOOL);
            VirtualStack.match(snapshot1, stack, token.getLocation());
        }

        TypeChecker.check(stack, doBlocks.get(0));
        VirtualStack snapshot2 = stack.snapshot();
        stack.load(snapshot1);

        for(int i = 1; i < doBlocks.size(); i++) {
            List<HighInst> dos = doBlocks.get(i);

            TypeChecker.check(stack, dos);
            VirtualStack.match(snapshot2, stack, token.getLocation());
            stack.load(snapshot1);
        }

        if(elseBlock != null) {
            TypeChecker.check(stack, elseBlock);
            VirtualStack.match(snapshot2, stack, token.getLocation());
        }
        stack.load(snapshot2);
    }

    @Override
    public String toString() {
        return "HBIf{" +
                "conditions=" + conditions +
                ", doBlocks=" + doBlocks +
                ", elseBlock=" + elseBlock +
                '}';
    }
}
