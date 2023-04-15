package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    private int gears;
    protected boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super.name=super.getName();
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;
    }

    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);

    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
 /*   move method called - The speed is changed to: 100, and the direction is changed to: 30 degrees
        steer method called - The direction is changed to: 60 degrees
        move method called - The speed is changed to: 20, and the direction is changed to: 30 degrees
        steer method called - The direction is changed to: 45 degrees
        move method called - The speed is changed to: 10, and the direction is changed to: 45 degrees
        steer method called - The direction is changed to: 45 degrees*/