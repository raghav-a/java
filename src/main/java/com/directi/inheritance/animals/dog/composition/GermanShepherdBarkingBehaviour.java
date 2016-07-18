package com.directi.inheritance.animals.dog.composition;

public class GermanShepherdBarkingBehaviour implements BarkingBehaviour {
    @Override
    public void bark() {
        System.out.println("GermanShepherd barking.");
    }
}
