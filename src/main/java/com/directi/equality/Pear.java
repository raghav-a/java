package com.directi.equality;

import java.util.ArrayList;
import java.util.HashMap;

public class Pear {
    private String color;

    public Pear(String color) {
        this.color = color;
    }
//
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Pear))
//            return false;
//        if (obj == this)
//            return true;
//        return this.color.equals(((Pear) obj).color);
//    }
//

    public int hashCode() {
        return this.color.length();
    }


    public static void main(String[] args) {
        Pear a1 = new Pear("green");
        Pear a2 = new Pear("white");

        //hashMap stores Pear type and its quantity
        HashMap<Pear, Integer> m = new HashMap<Pear, Integer>();
        m.put(a1, 10);
        m.put(a2, 20);
        System.out.println(m.get(new Pear("green")));

        ArrayList<Pear> pears = new ArrayList<Pear>() {
            {
                add(new Pear("green"));
                add(new Pear("yellow"));
            }
        };

        pears.remove(a1);
        System.out.println(pears);
    }
}