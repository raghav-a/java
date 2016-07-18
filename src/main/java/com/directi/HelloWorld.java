package com.directi;

import com.directi.staticblocks.InitializationBlocks;

public class HelloWorld extends FirstProgram {

    public static String globalName = "Raghav";
    final private String name = "Manohar";


    public HelloWorld(String name) {
        super(name);
        //this.name = name;
        InitializationBlocks.InnerClass innerClass = new InitializationBlocks.InnerClass();
    }

   /* public HelloWorld(){
        super(name);
        this("default");
    }*/

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("Raghav");
        System.out.println("HelloWorld " + helloWorld.name);
        System.out.println("HelloWorld " + HelloWorld.globalName);
    }
}
