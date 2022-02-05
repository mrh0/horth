package com.mrh0.horth.instructions.high;

import com.mrh0.horth.exceptions.HorthException;

import java.util.List;

public interface IDataChecked {
    void dataCheck(CompileData cd) throws HorthException;

    static void checkAll(CompileData cd, List<HighInst> insts) throws HorthException {
        for(HighInst inst : insts)
            if(inst instanceof IDataChecked)
                ((IDataChecked)inst).dataCheck(cd);
    }
}
