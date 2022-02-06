package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.instructions.high.branching.HBreak;
import com.mrh0.horth.instructions.high.io.HLog;
import com.mrh0.horth.instructions.high.stackops.base.HDrop;
import com.mrh0.horth.instructions.high.stackops.base.HDup;
import com.mrh0.horth.instructions.high.stackops.operands.HPutInt;
import com.mrh0.horth.instructions.high.stackops.operands.HPutString;
import com.mrh0.horth.instructions.high.stackops.other.HExit;
import com.mrh0.horth.instructions.high.stackops.base.HOver;
import com.mrh0.horth.instructions.high.stackops.base.HSwap;
import com.mrh0.horth.instructions.high.stackops.other.HLength;
import com.mrh0.horth.instructions.high.stackops.other.HVoid;

import java.util.List;

public class TKeyword extends Tok {
    private String text;

    public TKeyword(String text) {
        this.text = text;
    }

    @Override
    public void expand(List<HighInst> space) throws ParserException {
        switch(text) {
            case "exit":
                space.add(new HExit(this));
                break;
            case "break":
                space.add(new HBreak(this));
                break;
            case "dup":
                space.add(new HDup(this));
                break;
            case "drop":
                space.add(new HDrop(this));
                break;
            case "over":
                space.add(new HOver(this));
                break;
            case "swap":
                space.add(new HSwap(this));
                break;
            case "length":
                space.add(new HLength(this));
                break;
            case "log":
                space.add(new HLog(this));
                break;
            case "here":
                var fs = this.getLocation().getFileName();
                space.add(new HPutString(this, fs, fs.length()));
                space.add(new HPutInt(this.getLocation().getLine(),this));
                space.add(new HPutInt(this.getLocation().getPosOnLine(),this));
            break;
            case "void":
                space.add(new HVoid(this));
                break;
            default:
                throw new ParserException(this.getLocation(), "Unimplemented keyword: " + text + ".");
        }
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(text);
        return sb;
    }
}
