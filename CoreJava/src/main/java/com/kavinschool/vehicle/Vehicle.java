package com.kavinschool.vehicle;

/**
 * <p>Abstract Vehicle class.</p>
 *
 * @author kangs
 */
public abstract class Vehicle {
    /**
     * <p>start.</p>
     */
    public abstract void start();
    /**
     * <p>stop.</p>
     */
    public abstract void stop();
    /**
     * <p>drive.</p>
     */
    public abstract void drive();

    /**
     * <p>currentState.</p>
     *
     * @return a {@link com.kavinschool.vehicle.VehicleState} object
     */
    public abstract VehicleState currentState();

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
