package com.directi.exceptions;

public class ExceptionHandlingExample {

    public void doSomething() {
    }

    public static void main(String[] args) {
        try {
            new ExceptionHandlingExample().doSomething();
        } catch (Exception e) {
            //handle or rethrow wrapped exception
        } finally {
            //always executes if corresponding try is executed
            //primarily used for resource leaks
        }
    }
}
