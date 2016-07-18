package com.directi.inheritance.animals.dog;

import com.directi.inheritance.animals.Dog;

public class GermanShepherd extends Dog{

    @Override
    public void bark() {
        System.out.println("GermanShepherd barking.");
    }
}
