package com.kavinschool.vehicle;

public class Coupe extends Car{
    Door passengerSideDoor;
    Door driverSideDoor;

    public Coupe(Door passengerSideDoor, Door driverSideDoor) {
        this.passengerSideDoor = passengerSideDoor;
        this.driverSideDoor = driverSideDoor;
    }

    @Override
    public String toString() {
        return "Coupe{" +
                "door1=" + passengerSideDoor +
                ", door2=" + driverSideDoor +
                "} \n" + super.toString();
    }
}
