package com.mrh0.horth.output.x86_64.windows.low;

import com.mrh0.horth.ast.CompileData;

public interface LowInst {
    public static final String S1 = "rax";  //Stack1
    public static final String S2 = "rdx";  //Stack2
    public static final String T1 = "r10";  //Temp1
    public static final String T2 = "r11";  //Temp2
    public static final String LS = "r15";  //Local Stack

    public static class Builder {
        private StringBuilder sb;
        private int args = 0;
        private Builder(StringBuilder sb) {
            this.sb = sb;
        }
        private static Builder inst(StringBuilder sb, String inst, int args) {
            sb.append("\t");
            sb.append(inst);
            sb.append("\t");
            return new Builder(sb);
        }

        public static Builder zero(StringBuilder sb, String inst) {
            sb.append("\t");
            sb.append(inst);
            sb.append("\n");
            return new Builder(sb);
        }

        public static Builder one(StringBuilder sb, String inst) {
            return inst(sb, inst, 1);
        }

        public static Builder two(StringBuilder sb, String inst) {
            return inst(sb, inst, 2);
        }

        public Builder vreg(String reg, int offset) {
            sb.append("[");
            sb.append(reg);
            if(offset != 0)
                sb.append(offset > 0 ? "+" + offset : offset);
            sb.append("]");
            end();
            return this;
        }

        public Builder reg(String reg) {
            sb.append(reg);
            end();
            return this;
        }

        private void end() {
            if(--args > 0)
                sb.append(", ");
            else
                sb.append("\n");
        }
    }

    void asm(StringBuilder sb, CompileData cd);
}
