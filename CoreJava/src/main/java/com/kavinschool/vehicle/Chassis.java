package com.kavinschool.vehicle;

/**
 * <p>Chassis interface.</p>
 *
 * @author kangs
 */
public interface Chassis {
    /**
     * <p>getChassisType.</p>
     *
     * @return a {@link com.kavinschool.vehicle.ChassisType} object
     */
    ChassisType getChassisType();
    /**
     * <p>getChassisWeight.</p>
     *
     * @return a double
     */
    double getChassisWeight();
}
