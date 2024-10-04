package com.kavinschool.vehicle;

/**
 * <p>Coupe class.</p>
 *
 * @author kangs
 */
public class Coupe extends Car{
    Door passengerSideDoor;
    Door driverSideDoor;

    /**
     * <p>Constructor for Coupe.</p>
     *
     * @param passengerSideDoor a {@link com.kavinschool.vehicle.Door} object
     * @param driverSideDoor a {@link com.kavinschool.vehicle.Door} object
     */
    public Coupe(Door passengerSideDoor, Door driverSideDoor) {
        this.passengerSideDoor = passengerSideDoor;
        this.driverSideDoor = driverSideDoor;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Coupe{" +
                "door1=" + passengerSideDoor +
                ", door2=" + driverSideDoor +
                "} \n" + super.toString();
    }
}
