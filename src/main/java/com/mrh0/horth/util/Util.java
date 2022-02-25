package com.mrh0.horth.util;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.parser.ParserException;
import com.mrh0.horth.typechecker.types.AllTypes;
import com.mrh0.horth.typechecker.types.IType;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <T> T lastOf(List<T> list) {
        return list.get(list.size()-1);
    }
    public record RealString(String str, int len) {}

    public static String escapeString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }

    public static RealString unformatString(Loc location, String str, boolean skipEscaped) throws ParserException {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case '\n':
                    if(!skipEscaped)
                        sb.append("\\n");
                    break;
                case '\r':
                    if(!skipEscaped)
                        sb.append("\\r");
                    break;
                case '\t':
                    if(!skipEscaped)
                        sb.append("\\t");
                    break;
                case '\b':
                    if(!skipEscaped)
                        sb.append("\\b");
                    break;
                case '\f':
                    if(!skipEscaped)
                        sb.append("\\f");
                    break;
                case '\\':
                    c = str.charAt(++i);
                    if(c != 'n' && c != 'r' && c != 't' && c != 'b' && c != 'f' && c != '"' && c != '\'' && c != '0' && c != '\\')
                        throw new ParserException(location, "Invalid escape code: '\\" + c + "'.");
                    sb.append("\\"+c);
                    break;
                default:
                    sb.append(c);
                    break;
            }
            len++;
        }
        return new RealString(sb.toString(), len);
    }

    public static String formatPath(String path) {
        return path.replace("\\", "/");
    }

    public static <T> String list(T[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(i+1 < array.length)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static String list(IType[] types) {
        StringBuilder sb = new StringBuilder();
        if(types.length == 0)
            sb.append("void");
        for(int i = 0; i < types.length; i++) {
            sb.append(AllTypes.stringOf(types[i]));
            if(i+1 < types.length)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static <T> List<T> reverse(List<T> list) {
        List<T> out = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--)
            out.add(list.get(i));
        return out;
    }
}
