package com.kavinschool.vehicle;

import java.util.ArrayList;

public class Sedan extends Car implements GasEngine, Chassis, GasExhaustSystem{
    Door driverSideDoor;
    Door passengerSideFrontDoor;
    Door backLeftDoor;
    Door backRightDoor;

    ArrayList<Wheel> wheels;
    ArrayList<Tire> tires;

    public Sedan(Door driverSideDoor, Door passengerSideFrontDoor, Door backLeftDoor, Door backRightDoor) {
        this.driverSideDoor = driverSideDoor;
        this.passengerSideFrontDoor = passengerSideFrontDoor;
        this.backLeftDoor = backLeftDoor;
        this.backRightDoor = backRightDoor;
    }

    public Door getDriverSideDoor() {
        return driverSideDoor;
    }

    public void setDriverSideDoor(Door driverSideDoor) {
        this.driverSideDoor = driverSideDoor;
    }

    public Door getPassengerSideFrontDoor() {
        return passengerSideFrontDoor;
    }

    public void setPassengerSideFrontDoor(Door passengerSideFrontDoor) {
        this.passengerSideFrontDoor = passengerSideFrontDoor;
    }

    public Door getBackLeftDoor() {
        return backLeftDoor;
    }

    public void setBackLeftDoor(Door backLeftDoor) {
        this.backLeftDoor = backLeftDoor;
    }

    public Door getBackRightDoor() {
        return backRightDoor;
    }

    public void setBackRightDoor(Door backRightDoor) {
        this.backRightDoor = backRightDoor;
    }

    @Override
    public EngineLayout getEngineLayout() {
        return EngineLayout.V_ENGINE;
    }

    @Override
    public int getNumberOfCylinders() {
        return 6;
    }

    @Override
    public double getEmission() {
        return 30;
    }

    @Override
    public double getSilencerLevel() {
        return 5;
    }

    @Override
    public ChassisType getChassisType() {
        return ChassisType.MONOCOQUE;
    }

    @Override
    public double getChassisWeight() {
        return 200;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public ArrayList<Tire> getTires() {
        return tires;
    }

    public void setTires(ArrayList<Tire> tires) {
        this.tires = tires;
    }

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
