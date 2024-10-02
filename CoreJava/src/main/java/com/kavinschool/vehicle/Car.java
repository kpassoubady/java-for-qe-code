package com.kavinschool.vehicle;

public class Car extends Vehicle{
    private String make;
    private String model;
    private int year;

    VehicleState state;
    int numberOfSeatsPerCar;

    public Car() {
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, VehicleState state, int numberOfSeatsPerCar) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.state = state;
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", state=" + state +
                ", numberOfSeatsPerCar=" + numberOfSeatsPerCar +
                "} \n" + super.toString();
    }

    @Override
    public void start() {
        System.out.println("Car Started");
        this.state = VehicleState.STARTED;
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
        this.state = VehicleState.STOPPED;

    }

    @Override
    public void drive() {
        System.out.println("Car Running");
        this.state = VehicleState.RUNNING;
    }

    @Override
    public VehicleState currentState() {
        return this.state;
    }

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public int getNumberOfSeatsPerCar() {
        return numberOfSeatsPerCar;
    }

    public void setNumberOfSeatsPerCar(int numberOfSeatsPerCar) {
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }
}
