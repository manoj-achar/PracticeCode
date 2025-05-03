package com.practice.cast;

public class Vehicle {
    public void start() {
        System.out.println("Vehicle stars");
    }
}
class Car extends Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
    public void park() {
        System.out.println("Car parking");
    }
}

class Tests {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = (Car) vehicle;
        car.start();
        car.park();
    }
}
