package com.kavinschool.vehicle;

import java.util.ArrayList;

/**
 * <p>Truck class.</p>
 *
 * @author kangs
 */
public class Truck extends Vehicle implements DieselExhaustSystem{
    private String name;
    private TruckType truckType;
    private int maxLoad;
    private int currentLoad;
    private ArrayList<String> itemsInTheTruck;
    private VehicleState vehicleState;

    /**
     * <p>Constructor for Truck.</p>
     *
     * @param name a {@link java.lang.String} object
     * @param truckType a {@link com.kavinschool.vehicle.TruckType} object
     */
    public Truck(String name, TruckType truckType) {
        this.name = name;
        this.truckType = truckType;
    }

    /** {@inheritDoc} */
    @Override
    public void start() {
        System.out.println("Truck started");
        this.vehicleState = VehicleState.STARTED;
    }

    /** {@inheritDoc} */
    @Override
    public void stop() {
        System.out.println("Truck stopped");
        this.vehicleState = VehicleState.STOPPED;
    }

    /** {@inheritDoc} */
    @Override
    public void drive() {
        System.out.println("Truck running");
        this.vehicleState = VehicleState.RUNNING;
    }

    /** {@inheritDoc} */
    @Override
    public VehicleState currentState() {
        return vehicleState;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>truckType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.TruckType} object
     */
    public TruckType getTruckType() {
        return truckType;
    }

    /**
     * <p>Setter for the field <code>truckType</code>.</p>
     *
     * @param truckType a {@link com.kavinschool.vehicle.TruckType} object
     */
    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    /**
     * <p>Getter for the field <code>maxLoad</code>.</p>
     *
     * @return a int
     */
    public int getMaxLoad() {
        return maxLoad;
    }

    /**
     * <p>Setter for the field <code>maxLoad</code>.</p>
     *
     * @param maxLoad a int
     */
    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * <p>Getter for the field <code>currentLoad</code>.</p>
     *
     * @return a int
     */
    public int getCurrentLoad() {
        return currentLoad;
    }

    /**
     * <p>Setter for the field <code>currentLoad</code>.</p>
     *
     * @param currentLoad a int
     */
    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    /**
     * <p>Getter for the field <code>itemsInTheTruck</code>.</p>
     *
     * @return a {@link java.util.ArrayList} object
     */
    public ArrayList<String> getItemsInTheTruck() {
        return itemsInTheTruck;
    }

    /**
     * <p>Setter for the field <code>itemsInTheTruck</code>.</p>
     *
     * @param itemsInTheTruck a {@link java.util.ArrayList} object
     */
    public void setItemsInTheTruck(ArrayList<String> itemsInTheTruck) {
        this.itemsInTheTruck = itemsInTheTruck;
    }

    /**
     * <p>Getter for the field <code>vehicleState</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.VehicleState} object
     */
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    /**
     * <p>Setter for the field <code>vehicleState</code>.</p>
     *
     * @param vehicleState a {@link com.kavinschool.vehicle.VehicleState} object
     */
    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    /** {@inheritDoc} */
    @Override
    public double getEmission() {
        return 5;
    }

    /** {@inheritDoc} */
    @Override
    public double getSilencerLevel() {
        return 3;
    }
}
