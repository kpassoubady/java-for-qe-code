package com.kavinschool.vehicle;

public class Bike extends Vehicle {
    private HandleBarType handleBarType;
    private BikeType bikeType;
    private VehicleState state;

    public Bike(HandleBarType handleBarType, BikeType bikeType) {
        this.handleBarType = handleBarType;
        this.bikeType = bikeType;
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

    public HandleBarType getHandleBarType() {
        return handleBarType;
    }

    public void setHandleBarType(HandleBarType handleBarType) {
        this.handleBarType = handleBarType;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handleBarType=" + handleBarType +
                ", bikeType=" + bikeType +
                ", state=" + state +
                "} \n" + super.toString();
    }
}
