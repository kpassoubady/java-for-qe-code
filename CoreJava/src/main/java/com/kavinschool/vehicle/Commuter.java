package com.kavinschool.vehicle;

public class Commuter extends Train{
    VehicleState state;
    int numberOfSeatsPerCar;

    public Commuter(String engine, int numberOfCars, String name) {
        super(engine, numberOfCars, name);
    }

    public Commuter(String engine, int numberOfCars, String name, VehicleState state, int numberOfSeatsPerCar) {
        super(engine, numberOfCars, name);
        this.state = state;
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    @Override
    public void start() {
        System.out.println("Started");
        this.state = VehicleState.STARTED;
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
        this.state = VehicleState.STOPPED;

    }

    @Override
    public void drive() {
        System.out.println("Running");
        this.state = VehicleState.RUNNING;
    }

    @Override
    public String toString() {
        return "Commuter{" +
                "state=" + state +
                ", numberOfSeatsPerCar=" + numberOfSeatsPerCar +
                "} \n" + super.toString();
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

    @Override
    public VehicleState currentState() {
        return this.state;
    }
}
