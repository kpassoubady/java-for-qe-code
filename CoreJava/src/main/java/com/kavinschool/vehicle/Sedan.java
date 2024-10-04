package com.kavinschool.vehicle;

import java.util.ArrayList;

/**
 * <p>Sedan class.</p>
 *
 * @author kangs
 */
public class Sedan extends Car implements GasEngine, Chassis, GasExhaustSystem{
    Door driverSideDoor;
    Door passengerSideFrontDoor;
    Door backLeftDoor;
    Door backRightDoor;

    ArrayList<Wheel> wheels;
    ArrayList<Tire> tires;

    /**
     * <p>Constructor for Sedan.</p>
     *
     * @param driverSideDoor a {@link com.kavinschool.vehicle.Door} object
     * @param passengerSideFrontDoor a {@link com.kavinschool.vehicle.Door} object
     * @param backLeftDoor a {@link com.kavinschool.vehicle.Door} object
     * @param backRightDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public Sedan(Door driverSideDoor, Door passengerSideFrontDoor, Door backLeftDoor, Door backRightDoor) {
        this.driverSideDoor = driverSideDoor;
        this.passengerSideFrontDoor = passengerSideFrontDoor;
        this.backLeftDoor = backLeftDoor;
        this.backRightDoor = backRightDoor;
    }

    /**
     * <p>Getter for the field <code>driverSideDoor</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getDriverSideDoor() {
        return driverSideDoor;
    }

    /**
     * <p>Setter for the field <code>driverSideDoor</code>.</p>
     *
     * @param driverSideDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public void setDriverSideDoor(Door driverSideDoor) {
        this.driverSideDoor = driverSideDoor;
    }

    /**
     * <p>Getter for the field <code>passengerSideFrontDoor</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getPassengerSideFrontDoor() {
        return passengerSideFrontDoor;
    }

    /**
     * <p>Setter for the field <code>passengerSideFrontDoor</code>.</p>
     *
     * @param passengerSideFrontDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public void setPassengerSideFrontDoor(Door passengerSideFrontDoor) {
        this.passengerSideFrontDoor = passengerSideFrontDoor;
    }

    /**
     * <p>Getter for the field <code>backLeftDoor</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getBackLeftDoor() {
        return backLeftDoor;
    }

    /**
     * <p>Setter for the field <code>backLeftDoor</code>.</p>
     *
     * @param backLeftDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public void setBackLeftDoor(Door backLeftDoor) {
        this.backLeftDoor = backLeftDoor;
    }

    /**
     * <p>Getter for the field <code>backRightDoor</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getBackRightDoor() {
        return backRightDoor;
    }

    /**
     * <p>Setter for the field <code>backRightDoor</code>.</p>
     *
     * @param backRightDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public void setBackRightDoor(Door backRightDoor) {
        this.backRightDoor = backRightDoor;
    }

    /** {@inheritDoc} */
    @Override
    public EngineLayout getEngineLayout() {
        return EngineLayout.V_ENGINE;
    }

    /** {@inheritDoc} */
    @Override
    public int getNumberOfCylinders() {
        return 6;
    }

    /** {@inheritDoc} */
    @Override
    public double getEmission() {
        return 30;
    }

    /** {@inheritDoc} */
    @Override
    public double getSilencerLevel() {
        return 5;
    }

    /** {@inheritDoc} */
    @Override
    public ChassisType getChassisType() {
        return ChassisType.MONOCOQUE;
    }

    /** {@inheritDoc} */
    @Override
    public double getChassisWeight() {
        return 200;
    }

    /**
     * <p>Getter for the field <code>wheels</code>.</p>
     *
     * @return a {@link java.util.ArrayList} object
     */
    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    /**
     * <p>Setter for the field <code>wheels</code>.</p>
     *
     * @param wheels a {@link java.util.ArrayList} object
     */
    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    /**
     * <p>Getter for the field <code>tires</code>.</p>
     *
     * @return a {@link java.util.ArrayList} object
     */
    public ArrayList<Tire> getTires() {
        return tires;
    }

    /**
     * <p>Setter for the field <code>tires</code>.</p>
     *
     * @param tires a {@link java.util.ArrayList} object
     */
    public void setTires(ArrayList<Tire> tires) {
        this.tires = tires;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Sedan{" +
                "door1=" + driverSideDoor +
                ", door2=" + passengerSideFrontDoor +
                ", door3=" + backLeftDoor +
                ", door4=" + backRightDoor +
                ", wheels=" + wheels +
                ", tires=" + tires +
                "} \n" + super.toString();
    }
}
