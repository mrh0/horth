package com.mrh0.horth.util;

import com.mrh0.horth.exceptions.parser.ParserException;

import java.util.List;

public class Util {
    public static <T> T lastOf(List<T> list) {
        return list.get(list.size()-1);
    }
    public record RealString(String str, int len) {}

    public static String escapeString(String str, boolean skipReturn) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    if(!skipReturn)
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

    public static RealString unformatString(String str, boolean skipReturn) throws ParserException {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    if(!skipReturn)
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
                case '\\':
                    c = str.charAt(++i);
                    if(c != 'n' || c != 'r' || c != 't' || c != 'b' || c != 'f' || c != '"' || c != '\'' || c != '0' || c != '\\')
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
}
