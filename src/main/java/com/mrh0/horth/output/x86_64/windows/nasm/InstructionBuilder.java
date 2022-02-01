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
            sb.append(' ');
        sb.append('\t');
        first = true;
        return this;
    }

    public InstructionBuilder vreg(String reg, int offset) {
        begin();
        sb.append('[');
        sb.append(reg);
        if(offset != 0)
            sb.append(offset > 0 ? " + " + offset : " - " + (-offset));
        sb.append(']');
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
        sb.append(str);
        return this;
    }

    public InstructionBuilder label(long id) {
        sb.append("\nlabel_");
        sb.append(id);
        sb.append(':');
        return this;
    }

    public InstructionBuilder label(String name) {
        sb.append('\n');
        sb.append(name);
        sb.append(':');
        return this;
    }

    public InstructionBuilder jlabel(long id) {
        begin();
        sb.append("label_");
        sb.append(id);
        return this;
    }

    public InstructionBuilder slabel(int id) {
        begin();
        sb.append("str_");
        sb.append(id);
        return this;
    }

    public InstructionBuilder comment(String commend) {
        sb.append("\n;; ");
        sb.append(commend);
        return this;
    }

    public InstructionBuilder dbString(int id, String str) {
        sb.append('\n');
        sb.append(LowInst.strLabel(id));
        sb.append(": db ");
        int len = str.length();
        byte[] bytes = {
            (byte) len,
            (byte) (len >>> 8),
            (byte) (len >>> 16),
            (byte) (len >>> 24)
        };
        sb.append("0x");
        sb.append(Integer.toString(bytes[3], 16));
        sb.append(", 0x");
        sb.append(Integer.toString(bytes[2], 16));
        sb.append(", 0x");
        sb.append(Integer.toString(bytes[1], 16));
        sb.append(", 0x");
        sb.append(Integer.toString(bytes[0], 16));
        sb.append(", ");
        sb.append('"');
        sb.append(str);
        sb.append('"');
        return this;
    }

    private void begin() {
        if(!first)
            sb.append(", ");
        first = false;
    }
}
