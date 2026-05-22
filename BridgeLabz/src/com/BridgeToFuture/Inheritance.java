package com.BridgeToFuture;

public class Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Brand: "+c.brand);
		c.start();
		c.drive();
		
	}
}

class Vehicle {
    String brand = "Honda";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class (Derived class)
class Car extends Vehicle {
    int wheels = 4;

    void drive() {
        System.out.println("Car is driving with " + wheels + " wheels.");
    }
}
