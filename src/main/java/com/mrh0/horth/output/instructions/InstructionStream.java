package com.mrh0.horth.output.instructions;

import java.util.List;

public class InstructionStream<T> {
    private List<T> list;
    private int index = 0;

    public T next() {
        return list.get(index++);
    }
}
