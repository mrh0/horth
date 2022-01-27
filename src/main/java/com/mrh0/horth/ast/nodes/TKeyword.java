package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.branching.HBreak;
import com.mrh0.horth.output.instructions.high.stackops.base.HDrop;
import com.mrh0.horth.output.instructions.high.stackops.base.HDup;
import com.mrh0.horth.output.instructions.high.stackops.HExit;
import com.mrh0.horth.output.instructions.high.stackops.base.HOver;
import com.mrh0.horth.output.instructions.high.stackops.base.HSwap;

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
            default:
                throw new ParserException();
        }
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append(text);
        return sb;
    }
}
