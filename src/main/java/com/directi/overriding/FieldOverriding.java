package com.directi.overriding;

class Super {
    String s = "Super";
}

class Sub extends Super {
    String s = "Sub";
}

public class FieldOverriding {
    public static void main(String[] args) {
        Sub c1 = new Sub();
        System.out.println(((Super)c1).s);

        Super c2 = new Sub();
        System.out.println(c2.s);



    }
}