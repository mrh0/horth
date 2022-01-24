package com.mrh0.horth.util;

import java.util.List;

public class Util {
    public static <T> T lastOf(List<T> list) {
        return list.get(list.size()-1);
    }
}
