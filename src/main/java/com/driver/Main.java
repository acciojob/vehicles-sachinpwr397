package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an instance of F1
        F1 mercedes = new F1("Mercedes", false);

        // Move the F1 car
        mercedes.move(40, 0);

        // Accelerate the F1 car
        mercedes.accelerate(20);

        // Decelerate the F1 car
        mercedes.accelerate(-60);

        // Create an instance of Boat
        Boat boat = new Boat("Speedy", 10);

        // Display boat information
        System.out.println("Boat name: " + boat.getVehicleName());
        System.out.println("Boat capacity: " + boat.getVehicleCapacity());
    }
}
