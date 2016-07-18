package com.directi.inheritance.animals.dog.composition;

public class LabradorBarkingBehaviour implements BarkingBehaviour {
    @Override
    public void bark() {
        System.out.println("Labrador barking.");
    }
}
