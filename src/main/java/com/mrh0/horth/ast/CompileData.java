package com.mrh0.horth.ast;

public class CompileData {
    private int labelNum = 0;
    public int getLabelNum() {
        return labelNum++;
    }
}
