package com.kavinschool.vehicle;

public class VehiclePolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Hundai", "Accent", 2022, VehicleState.STOPPED, 4);
        System.out.println(vehicle);
        vehicle.drive();
        System.out.println(vehicle.currentState());
        System.out.println("=".repeat(40));
        vehicle = new Commuter("electric",10,"BART", VehicleState.STOPPED,20);
        System.out.println(vehicle);
        vehicle.start();
        System.out.println(vehicle.currentState());
        System.out.println("=".repeat(40));
    }
}
