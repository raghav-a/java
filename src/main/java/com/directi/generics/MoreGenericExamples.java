package com.directi.generics;

import java.util.List;

public class MoreGenericExamples {

    public <N extends Number> double add(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <N extends Number> boolean contains(List<? extends Number> list, N b) {
        for (Number number : list) {
            if (number.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public <N extends Number> boolean contains2(List<? super Integer> list, N b) {
        for (Object o : list) {
            if (o.equals(b)) {
                return true;
            }
        }
        return false;
    }
}
