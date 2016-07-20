package com.directi.exceptions;

public class CheckedExample {

    public void doDangerousWork() throws JavaCheckedException {
        throw new JavaCheckedException();
    }

    private class JavaCheckedException extends Exception {
    }

    public static void main(String[] args) {
        CheckedExample checkedExample = new CheckedExample();
        try {
            checkedExample.doDangerousWork();
        } catch (JavaCheckedException e) {
            e.printStackTrace();
        }
    }
}
