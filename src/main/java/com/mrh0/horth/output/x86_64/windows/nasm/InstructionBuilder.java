package com.mrh0.horth.output.x86_64.windows.nasm;

public class InstructionBuilder {
    private StringBuilder sb;
    private boolean first = true;
    public InstructionBuilder(StringBuilder sb) {
        this.sb = sb;
    }

    public InstructionBuilder inst(String inst) {
        sb.append("\n\t");
        sb.append(inst);
        for(int i = inst.length(); i < 4; i++)
            sb.append(" ");
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

    public InstructionBuilder append(Object str) {
        begin();
        sb.append(str);
        return this;
    }

    public InstructionBuilder label(String name) {
        sb.append("\n");
        sb.append(name);
        sb.append(":");
        return this;
    }

    public InstructionBuilder label(long id) {
        begin();
        sb.append("_inst");
        sb.append(id);
        return this;
    }

    public InstructionBuilder comment(String commend) {
        sb.append("; ");
        sb.append(commend);
        return this;
    }

    private void begin() {
        if(!first)
            sb.append(", ");
        first = false;
    }
}
