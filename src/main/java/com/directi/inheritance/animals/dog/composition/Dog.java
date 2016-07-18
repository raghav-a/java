package com.directi.inheritance.animals.dog.composition;

public class Dog {

    private BarkingBehaviour barkingBehaviour;

    public Dog(BarkingBehaviour barkingBehaviour) {

        this.barkingBehaviour = barkingBehaviour;
    }

    public void bark() {
        barkingBehaviour.bark();
    }


    public static void main(String[] args) {

        Dog labrador = new Dog(new LabradorBarkingBehaviour());
        labrador.bark();

        Dog germanShepherd = new Dog(new GermanShepherdBarkingBehaviour());
        germanShepherd.bark();
    }
}
