package com.directi.generics;

import java.util.ArrayList;
import java.util.List;

public class Difference {

    public void exampleWithoutGenerics() {
        String first = "first";

        ListWithNoGenerics list = new ListWithNoGenerics();
        list.add(first);

        String firstElementInList = (String) list.get(0);

        checkIfEqual(first, firstElementInList);
    }

    private static class ListWithNoGenerics extends ArrayList<Object> {
    }

    private static void checkIfEqual(String first, String firstElementInList) {
        if (firstElementInList.equals(first)) {
            System.out.println("List works fine");
        } else {
            System.out.println("List doesn't works fine");
        }
    }

    public static void exampleWithGenerics() {
        String first = "first";

        List<String> list = new ArrayList<String>();
        list.add(first);

        String firstElementInList = list.get(0);

        checkIfEqual(first, firstElementInList);
    }

}