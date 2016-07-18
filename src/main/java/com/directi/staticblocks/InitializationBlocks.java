package com.directi.staticblocks;

public class InitializationBlocks {

    InitializationBlocks() {
        System.out.print("1 ");
    }

    static {
        System.out.print("4 ");
    }

    void go() {
        System.out.print("3 ");
    }

    {
        System.out.print("2 ");
    }

    public static void main(String[] args) {
        new InitializationBlocks().go();

        System.out.println("\n");

        new InitializationBlocks().go();

    }

    public static class  InnerClass{

    }
}
