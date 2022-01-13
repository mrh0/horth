package com.mrh0.horth.output.x86_64.windows.nasm;

import com.mrh0.horth.output.x86_64.windows.nasm.stackop.put.LPutInt;
import com.mrh0.horth.output.x86_64.windows.nasm.stackop.put.LPutInt2;

import java.util.ArrayList;
import java.util.List;

public class Optimizer {
    public static List<LowInst> optimize(List<LowInst> list) {
        int prev = list.size();
        List<LowInst> n = new ArrayList<>();
        for(int i = 0; i < list.size()-1; i++) {
            LowInst a = list.get(i), b = list.get(i+1);
            if(a instanceof LPutInt) {
                if(b instanceof LPutInt) {
                    n.add(new LPutInt2((LPutInt)a, (LPutInt)b));
                }
                else
                    n.add(a);
            }
            else
                n.add(a);
        }
        n.add(list.get(list.size()-1));

        if(prev != n.size() && n.size() > 1)
            return optimize(n);
        return n;
    }
}
