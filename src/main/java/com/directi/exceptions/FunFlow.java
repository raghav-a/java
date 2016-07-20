package com.directi.exceptions;

public class FunFlow {
    static class MyExc1 extends Exception {
    }

    static class MyExc2 extends Exception {
    }

    public static void main(String[] argv) throws Exception {
        try {
            System.out.print(1);
            q();

        } catch (Exception i) {
            throw (new MyExc2());
        } finally {
            System.out.print(2);
            throw (new MyExc1());
        }

    }

    static void q() throws Exception {
        try {
            throw (new MyExc1());
        } catch (Exception y) {
        } finally {
            System.out.print(3);
            throw (new Exception());
        }
    }
}
