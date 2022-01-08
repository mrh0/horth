package com.mrh0.horth.output.x86_64.windows.low;

import com.mrh0.horth.ast.CompileData;

public interface LowInst {
    public static final String S1 = "rax";  //Stack1
    public static final String S2 = "rdx";  //Stack2
    public static final String T1 = "r10";  //Temp1
    public static final String T2 = "r11";  //Temp2
    public static final String LS = "r15";  //Local Stack

    //public static Builder builder = new Builder();

    public static class Builder {
        private StringBuilder sb;
        private boolean first = true;
        private Builder(StringBuilder sb) {
            this.sb = sb;
        }

        private Builder inst(String inst) {
            sb.append("\n\t");
            sb.append(inst);
            sb.append("\t");
            first = true;
            return this;
        }

        public Builder vreg(String reg, int offset) {
            begin();
            sb.append("[");
            sb.append(reg);
            if(offset != 0)
                sb.append(offset > 0 ? "+" + offset : offset);
            sb.append("]");
            return this;
        }

        public Builder reg(String reg) {
            begin();
            sb.append(reg);
            return this;
        }

        public Builder append(String str) {
            sb.append(str);
            return this;
        }

        private void begin() {
            if(!first)
                sb.append(", ");
            first = false;
        }
    }

    void asm(StringBuilder sb, CompileData cd);
}
