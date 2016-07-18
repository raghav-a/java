package com.directi.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Questions {
    public static void main(String[] args) {

        autoboxing();
        int value = unboxing();
        System.out.println(value);


        /*String[] arr = {"hi", "hello", "bye"};
        List<String> list = Arrays.asList(arr);
        ArrayList<String> arrayList = new ArrayList<String>(list);

        List<String> strings = Lists.newArrayList("hi", "bye", "hello");*/


    }

    private static int unboxing() {
        return new Integer(1);
    }

    private static void autoboxing() {
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 1; i < 50; i += 2)
            li.add(i);

        System.out.println(li);

    }

    public static void removeFromList1() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (String s : list) {
            if (s.equals("a"))
                list.remove(s);
        }
    }

    public static void removeFromList2() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();

            if (s.equals("a")) {
                iter.remove();
            }
        }
    }

    class c1 implements I1, I2 {


        @Override
        public void m1() {

        }

        public void method(String s) {

        }

        public String method() {
            return null;
        }
    }

    interface I1 {
        public void m1();
    }

    interface I2 {
        public void m1();
    }


}
