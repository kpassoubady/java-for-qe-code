package com.kavinschool.vehicle;

/**
 * <p>Brake class.</p>
 *
 * @author kangs
 */
public class Brake {
    BrakeType brakeType;
    BrakePadType brakePadType;

    /**
     * <p>Constructor for Brake.</p>
     *
     * @param brakeType a {@link com.kavinschool.vehicle.BrakeType} object
     * @param brakePadType a {@link com.kavinschool.vehicle.BrakePadType} object
     */
    public Brake(BrakeType brakeType, BrakePadType brakePadType) {
        this.brakeType = brakeType;
        this.brakePadType = brakePadType;
    }

    /**
     * <p>Getter for the field <code>brakeType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.BrakeType} object
     */
    public BrakeType getBrakeType() {
        return brakeType;
    }

    /**
     * <p>Setter for the field <code>brakeType</code>.</p>
     *
     * @param brakeType a {@link com.kavinschool.vehicle.BrakeType} object
     */
    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }

    /**
     * <p>Getter for the field <code>brakePadType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.BrakePadType} object
     */
    public BrakePadType getBrakePadType() {
        return brakePadType;
    }

    /**
     * <p>Setter for the field <code>brakePadType</code>.</p>
     *
     * @param brakePadType a {@link com.kavinschool.vehicle.BrakePadType} object
     */
    public void setBrakePadType(BrakePadType brakePadType) {
        this.brakePadType = brakePadType;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Brake{" +
                "brakeType=" + brakeType +
                ", brakePadType=" + brakePadType +
                '}';
    }
}
