package com.mrh0.horth.output.x86_64.windows.low;

public class InstructionBuilder {
    private StringBuilder sb;
    private boolean first = true;
    private InstructionBuilder(StringBuilder sb) {
        this.sb = sb;
    }

    public InstructionBuilder inst(String inst) {
        sb.append("\n\t");
        sb.append(inst);
        sb.append("\t");
        first = true;
        return this;
    }

    public InstructionBuilder vreg(String reg, int offset) {
        begin();
        sb.append("[");
        sb.append(reg);
        if(offset != 0)
            sb.append(offset > 0 ? " + " + offset : " - " + (-offset));
        sb.append("]");
        return this;
    }

    public InstructionBuilder reg(String reg) {
        begin();
        sb.append(reg);
        return this;
    }

    public InstructionBuilder imm(int i) {
        begin();
        sb.append(i);
        return this;
    }

    public InstructionBuilder append(String str) {
        begin();
        sb.append(str);
        return this;
    }

    private void begin() {
        if(!first)
            sb.append(", ");
        first = false;
    }
}
