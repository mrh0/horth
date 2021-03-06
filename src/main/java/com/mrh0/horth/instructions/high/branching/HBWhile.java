package com.mrh0.horth.instructions.high.branching;

import com.mrh0.horth.ast.nodes.branching.TWhile;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.HighLabel;
import com.mrh0.horth.instructions.high.IExpanding;
import com.mrh0.horth.typechecker.*;
import com.mrh0.horth.typechecker.types.AllTypes;

import java.util.ArrayList;
import java.util.List;

public class HBWhile extends HighInst implements ISpecialCheck, IExpanding {
    private final List<HighInst> condition;
    private final List<HighInst> doBlock;
    private List<HighInst> elseBlock;

    public HBWhile(TWhile tok) throws HorthException {
        super(tok);
        this.condition =  new ArrayList<>();
        tok.condition.expand(condition);
        this.doBlock = new ArrayList<>();
        tok.doBlock.expand(doBlock);
        if(tok.elseBlock != null) {
            this.elseBlock = new ArrayList<>();
            tok.elseBlock.expand(elseBlock);
        }
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        HighLabel endLabel = new HighLabel();
        if(elseBlock == null) {
            HighLabel condLabel = new HighLabel();
            space.add(condLabel);
            IExpanding.expandAll(condition, space);
            space.add(new HBranch(token, endLabel));

            List<HighInst> expandedDoBlock = new ArrayList<>();
            IExpanding.expandAll(doBlock, expandedDoBlock);
            for(HighInst inst : expandedDoBlock) {
                if (inst instanceof HBreak) {
                    HBreak hbreak = ((HBreak) inst);
                    if(hbreak.label == null)
                        hbreak.label = endLabel;
                }
                /*else if(inst instanceof HContinue) {

                }*/
            }
            space.addAll(expandedDoBlock);

            space.add(new HJump(condLabel));
        }
        else {
            //TODO: Else Block
        }
        space.add(endLabel);
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        VirtualTypeStack snapshot = stack.snapshot();

        TypeChecker.check(stack, cd, condition);
        stack.check(token, AllTypes.BOOL);
        VirtualTypeStack.match(snapshot, stack, token.getLocation());

        //TODO: type/stack check break and continue
        TypeChecker.check(stack, cd, doBlock);
        VirtualTypeStack.match(snapshot, stack, token.getLocation());

        if (elseBlock != null) {
            TypeChecker.check(stack, cd, elseBlock);
            VirtualTypeStack.match(snapshot, stack, token.getLocation());
        }
    }
}