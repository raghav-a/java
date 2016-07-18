package com.directi.overloading;

import com.directi.inheritance.animals.Dog;

public class Overloading {

    public static class Human {

        Human(){
        }

        public void eat() {

        }

        public void eat(String foodItemName) {

        }

        public void eat(Dog dog) {

        }

        /*public Boolean eat(Dog dog) {
            return true;
        }*/

        public Boolean eat(Dog dog, String type) {
            return true;
        }

        /*public static void eat() {

        }*/

    }
}
