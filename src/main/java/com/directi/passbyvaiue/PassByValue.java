package com.directi.passbyvaiue;

public class PassByValue {

    public static void main(String[] args) {
        PassByValue p = new PassByValue();
        Integer i = 5;

        p.method(i);
        System.out.println("Value in Main is : " + i);

        p.method2(i);
    }

    private void method(Integer value) {
        System.out.println("Value in method is : " + ++value);
        //increments bfor expression is evaluated
    }

    private void method2(int value) {
        System.out.println("Value in method2 is : " + value++);
        //increments after expression is evaluated
    }
}
