package com.directi.binding;

import com.directi.inheritance.animals.Animal;
import com.directi.inheritance.animals.Dog;

public class StaticBinding {

    /*public static void main(String[] args) {
        String[] pets = {"dog",1,"cat"};
    }*/

    public static void callEat(Animal animal) {
        System.out.println("Animal is eating");
    }
    public static void callEat(Dog dog) {
        System.out.println("Dog is eating");
    }

    public static void main(String args[])
    {
        Dog a = new Dog();
        callEat(a);
    }
}
