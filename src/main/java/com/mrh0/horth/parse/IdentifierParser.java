package com.mrh0.horth.parse;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.instructions.high.CompileData;
import com.mrh0.horth.instructions.high.HighInst;
import com.mrh0.horth.typechecker.types.IType;

import java.util.List;

public class IdentifierParser {
    public static void expand(Loc location, String ident, List<HighInst> space, CompileData cd) throws HorthException {
        StringBuilder sb = new StringBuilder();
        boolean isAddr = ident.charAt(0) == '@';
        IType cur = null;
        for(int i = 1; i < ident.length(); i++) {
            char c = ident.charAt(i);
            switch (c) {
                case '.':
                    String str = sb.toString();
                    sb = new StringBuilder();
                    if(cur == null) {
                        cur = cd.findNamedLocal(location, str).type();
                        continue;
                    }

                    //if(str.length() == 0)
                        //is ref?

                    var prop = cur.getProperty(location, str);
                    cur = prop.type();
                    //TODO: append read to space

                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
    }
}
