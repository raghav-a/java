package com.directi.binding;

public class DynamicBinding {


    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        try {
            vehicle.start();
        } catch (Exception e) {
            e.printStackTrace();
            return;

        } finally {
            //System.out.println("finally");
        }

        System.out.println("finally");
    }


    static class Vehicle {
        public void start() throws VehicleNotFoundException, OneMoreException {
            System.out.println("Inside start method of Vehicle");
            throw new OneMoreException();
        }
    }

    static class Car extends Vehicle {
        @Override
        public void start() throws OneMoreException {
            System.out.println("Inside start method of Car");
            throw new OneMoreException();
        }
    }
}