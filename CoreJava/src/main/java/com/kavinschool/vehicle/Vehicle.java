package com.kavinschool.vehicle;

public abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
    public abstract void drive();

    public abstract VehicleState currentState();

    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
