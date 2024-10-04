package com.kavinschool.vehicle;

/**
 * <p>Convertibles class.</p>
 *
 * @author kangs
 */
public class Convertibles extends Car{
    Door door1;
    Door door2;
    RoofType roofType;
    RoofState roofState;

    /**
     * <p>Constructor for Convertibles.</p>
     *
     * @param door1 a {@link com.kavinschool.vehicle.Door} object
     * @param door2 a {@link com.kavinschool.vehicle.Door} object
     * @param roofType a {@link com.kavinschool.vehicle.RoofType} object
     * @param roofState a {@link com.kavinschool.vehicle.RoofState} object
     */
    public Convertibles(Door door1, Door door2, RoofType roofType, RoofState roofState) {
        this.door1 = door1;
        this.door2 = door2;
        this.roofType = roofType;
        this.roofState = roofState;
    }

    /**
     * <p>Getter for the field <code>door1</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getDoor1() {
        return door1;
    }

    /**
     * <p>Setter for the field <code>door1</code>.</p>
     *
     * @param door1 a {@link com.kavinschool.vehicle.Door} object
     */
    public void setDoor1(Door door1) {
        this.door1 = door1;
    }

    /**
     * <p>Getter for the field <code>door2</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Door} object
     */
    public Door getDoor2() {
        return door2;
    }

    /**
     * <p>Setter for the field <code>door2</code>.</p>
     *
     * @param door2 a {@link com.kavinschool.vehicle.Door} object
     */
    public void setDoor2(Door door2) {
        this.door2 = door2;
    }

    /**
     * <p>Getter for the field <code>roofType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.RoofType} object
     */
    public RoofType getRoofType() {
        return roofType;
    }

    /**
     * <p>Setter for the field <code>roofType</code>.</p>
     *
     * @param roofType a {@link com.kavinschool.vehicle.RoofType} object
     */
    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    /**
     * <p>Getter for the field <code>roofState</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.RoofState} object
     */
    public RoofState getRoofState() {
        return roofState;
    }

    /**
     * <p>Setter for the field <code>roofState</code>.</p>
     *
     * @param roofState a {@link com.kavinschool.vehicle.RoofState} object
     */
    public void setRoofState(RoofState roofState) {
        this.roofState = roofState;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Convertibles{" +
                "door1=" + door1 +
                ", door2=" + door2 +
                ", roofType=" + roofType +
                ", roofState=" + roofState +
                "} \n" + super.toString();
    }
}
