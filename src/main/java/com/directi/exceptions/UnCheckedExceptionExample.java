package com.directi.exceptions;

public class UnCheckedExceptionExample {
    public void doDangerousWork() {
        throw new JavaUnCheckedException();
    }

    private class JavaUnCheckedException extends RuntimeException {
    }
}
