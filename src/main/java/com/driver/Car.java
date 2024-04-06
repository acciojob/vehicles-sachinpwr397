package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int seats;
    private int currentGear; // Track the current gear of the car

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name); // Call the constructor of the superclass (Vehicle) with the name parameter
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1; // Initialize the current gear to 1 when the car is created
    }

    public void changeGear(int newGear){
        // Change the gear of the car
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    @Override
    public void move(int speed, int direction){
        super.move(speed, direction); // Call the move method of the superclass (Vehicle)
        System.out.println("Car specific move method called");
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection); // Call the move method of the superclass (Vehicle)
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
