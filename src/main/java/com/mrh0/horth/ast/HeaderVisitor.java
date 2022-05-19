package com.mrh0.horth.ast;

import com.mrh0.horth.antlr.header.HorthHeaderBaseVisitor;
import com.mrh0.horth.antlr.header.HorthHeaderParser;
import com.mrh0.horth.ast.nodes.ITok;
import com.mrh0.horth.ast.nodes.TProgram;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HeaderVisitor extends HorthHeaderBaseVisitor<ITok> {
    private File file;

    public HeaderVisitor(File file) {
        this.file = file;
    }

    public <T extends ParserRuleContext, O extends ITok> List<O> visit(List<T> list) {
        List<O> t = new ArrayList<>();
        for(T pt : list)
            t.add((O)visit(pt));
        return t;
    }

    @Override
    public ITok visitProgram(HorthHeaderParser.ProgramContext ctx) {
        return new TProgram(ctx.moduleName == null ? "" : ctx.moduleName.getText(), visit(ctx.includes), null)
                .loc(ctx.start, file);
    }
}
