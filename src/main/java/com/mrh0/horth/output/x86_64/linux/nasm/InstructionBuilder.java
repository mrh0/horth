package com.mrh0.horth.output.x86_64.linux.nasm;

import com.mrh0.horth.util.Util;

public class InstructionBuilder {
    private StringBuilder sb;
    private boolean first = true;
    private static long lowLabelId = 0;
    public InstructionBuilder(StringBuilder sb) {
        this.sb = sb;
    }

    public void endLowLabel() {
        lowLabelId++;
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

    public InstructionBuilder vreg_dw(String reg, int offset) {
        begin();
        sb.append("DWORD ");
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

    public InstructionBuilder lowLabel(long id) {
        sb.append("\nlow_label_");
        sb.append(id + "_" + lowLabelId);
        sb.append(':');
        return this;
    }

    public InstructionBuilder jlowLabel(long id) {
        begin();
        sb.append("low_label_");
        sb.append(id + "_" + lowLabelId);
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
        sb.append(LowInst.strLabel(id));
        return this;
    }

    public InstructionBuilder alabel(String atom) {
        begin();
        sb.append(LowInst.atomLabel(atom));
        return this;
    }

    public InstructionBuilder qword() {
        return this.append("QWORD ");
    }

    public InstructionBuilder comment(String commend) {
        sb.append("\n;; ");
        sb.append(commend);
        return this;
    }

    public InstructionBuilder dbString(int id, Util.RealString str) {
        sb.append('\n');
        sb.append(LowInst.strLabel(id));
        sb.append(":\n\tdq ");
        sb.append(str.len());
        sb.append("\n\tdb ");
        sb.append('`');
        sb.append(str.str());
        sb.append('`');
        sb.append("\n\tdb 0");
        return this;
    }

    public InstructionBuilder dbAtom(String atom) {
        sb.append('\n');
        sb.append(LowInst.atomLabel(atom));
        sb.append(":\n\tdq ");
        sb.append(atom.length());
        sb.append("\n\tdb ");
        sb.append('"');
        sb.append(atom);
        sb.append('"');
        return this;
    }

    private void begin() {
        if(!first)
            sb.append(", ");
        first = false;
    }
}
