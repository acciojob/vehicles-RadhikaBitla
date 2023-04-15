package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(100, 30);
        mercedes.steer(60);
        mercedes.move(20,30);
        mercedes.steer(45);
        mercedes.move(10,45);
        mercedes.steer(45);
    }
}