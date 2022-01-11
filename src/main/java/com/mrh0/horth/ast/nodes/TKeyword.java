package com.mrh0.horth.ast.nodes;

import com.mrh0.horth.ast.CompileData;
import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.instructions.high.stackops.HExit;

import java.util.List;

public class TKeyword extends Tok {
    private String text;

    public TKeyword(String text) {
        this.text = text;
    }

    @Override
    public void expand(List<HighInst> space, CompileData cd) throws ParserException {
        switch(text) {
            case "exit":
                space.add(new HExit(this));
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
