package com.kavinschool.vehicle;

import java.util.ArrayList;

public class Truck extends Vehicle implements DieselExhaustSystem{
    private String name;
    private TruckType truckType;
    private int maxLoad;
    private int currentLoad;
    private ArrayList<String> itemsInTheTruck;
    private VehicleState vehicleState;

    public Truck(String name, TruckType truckType) {
        this.name = name;
        this.truckType = truckType;
    }

    @Override
    public void start() {
        System.out.println("Truck started");
        this.vehicleState = VehicleState.STARTED;
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
        this.vehicleState = VehicleState.STOPPED;
    }

    @Override
    public void drive() {
        System.out.println("Truck running");
        this.vehicleState = VehicleState.RUNNING;
    }

    @Override
    public VehicleState currentState() {
        return vehicleState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    public ArrayList<String> getItemsInTheTruck() {
        return itemsInTheTruck;
    }

    public void setItemsInTheTruck(ArrayList<String> itemsInTheTruck) {
        this.itemsInTheTruck = itemsInTheTruck;
    }

    public VehicleState getVehicleState() {
        return vehicleState;
    }

    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    @Override
    public double getEmission() {
        return 5;
    }

    @Override
    public double getSilencerLevel() {
        return 3;
    }
}
