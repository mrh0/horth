package com.mrh0.horth.output.instructions.high;

import com.mrh0.horth.exceptions.HorthException;

import java.util.List;

public interface IExpanding {
    void expand(List<HighInst> space) throws HorthException;
}
