package com.directi.inheritance;

public class Inheritance {

    static class Base {
        public void show() {
            System.out.println("Base::show() called");
        }
    }

    static class Derived extends Base {
        public void show() {
            System.out.println("Derived::show() called");
        }
    }

    static class Main {
        public static void main(String[] args) {
            Base b = new Derived();
            b.show();
        }
    }
}
