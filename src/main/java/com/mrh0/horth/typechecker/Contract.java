package com.mrh0.horth.typechecker;

import java.util.ArrayList;
import java.util.List;

public class Contract {
    private List<IType> pop;
    private List<IType> push;

    private Contract() {
        pop = new ArrayList<>();
        push = new ArrayList<>();
    }

    public static class Builder {
        private Contract c;

        private Builder() {
            c = new Contract();
        }

        public static Builder stack() {
            return new Builder();
        }

        public Builder pop(IType type) {
            c.pop.add(type);
            return this;
        }

        public Builder push(IType type) {
            c.push.add(type);
            return this;
        }

        public Contract build() {
            return c;
        }
    }
}
