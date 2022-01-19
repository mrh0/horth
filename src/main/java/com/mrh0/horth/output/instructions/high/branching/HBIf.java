package com.mrh0.horth.output.instructions.high.branching;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.TBlock;
import com.mrh0.horth.ast.nodes.branching.TIf;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.exceptions.typechecker.BreachOfContractException;
import com.mrh0.horth.exceptions.typechecker.TypeCheckerException;
import com.mrh0.horth.output.instructions.high.HighBlock;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.TypeChecker;
import com.mrh0.horth.typechecker.VirtualStack;

import java.util.ArrayList;
import java.util.List;

public class HBIf extends HighBlock implements ISpecialCheck {
    private final List<TBlock> conditions;
    private final List<TBlock> doBlocks;
    private final TBlock elseBlock;

    public HBIf(TIf tok) {
        super(tok);
        this.conditions  = tok.conditions;
        this.doBlocks = tok.doBlocks;
        this.elseBlock = tok.elseBlock;
    }

    @Override
    public IContract getContract() {
        return null;
    }

    @Override
    public void expand(List<HighInst> space) throws HorthException {
        if(conditions.size() == 1 && elseBlock == null) {

        }
        else if(conditions.size() == 1) {

        }
        else {

        }
    }

    @Override
    public void check(VirtualStack stack) throws HorthException {
        VirtualStack snapshot = stack.snapshot();
        for(TBlock cond : conditions) {
            List<HighInst> insts = new ArrayList<>();
            cond.expand(insts);

            TypeChecker.check(stack, insts);
            stack.pop();
            VirtualStack.match(stack, snapshot);
        }

        for(TBlock dos : doBlocks) {
            List<HighInst> insts = new ArrayList<>();
            dos.expand(insts);

            TypeChecker.check(stack, insts);
            VirtualStack.match(stack, snapshot);
        }

        List<HighInst> insts = new ArrayList<>();
        elseBlock.expand(insts);

        TypeChecker.check(stack, insts);
        VirtualStack.match(stack, snapshot);
    }
}
