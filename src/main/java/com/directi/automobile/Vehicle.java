package com.directi.automobile;

import java.util.List;

public abstract class Vehicle {

    List<Tyre> tyres;

    List<Part> parts;

    List<Accessory> accessories;


    public abstract Double price();
}
