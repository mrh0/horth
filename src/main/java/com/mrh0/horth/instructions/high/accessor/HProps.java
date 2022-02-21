package com.mrh0.horth.instructions.high.accessor;

import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.Contract;
import com.mrh0.horth.typechecker.IContract;
import com.mrh0.horth.typechecker.ISpecialCheck;
import com.mrh0.horth.typechecker.VirtualTypeStack;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class HProps extends HighInst implements ISpecialCheck {
    private final List<String> props;

    public HProps(ITok token, List<String> props) {
        super(token);
        this.props = props;
    }

    @Override
    public IContract getContract() {
        return Contract.VOID;
    }

    @Override
    public void check(VirtualTypeStack stack, CompileData cd) throws HorthException {
        IType root = stack.pop(token).type();
        IType.TypeProperty prop = root.getProperty(token.getLocation(), props.get(0));
        for(int i = 1; i < props.size(); i++) {
            prop = prop.type().getProperty(token.getLocation(), props.get(i));
        }
        System.out.println("TYPE: " + prop.type());
        stack.push(prop.type(), token);
    }
}
