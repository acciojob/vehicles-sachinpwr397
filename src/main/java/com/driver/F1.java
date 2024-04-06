package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, isManual); // Call the constructor of the superclass (Car)
    }

    @Override
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate; // Calculate new speed

        // Determine gear based on speed
        int newGear;
        if (newSpeed <= 0) {
            newGear = 1; // Negative speed or stopping, set gear as 1
            stop(); // Stop the car
        } else if (newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }

        // Apply new speed and gear
        changeSpeed(newSpeed, newGear);
    }
}
