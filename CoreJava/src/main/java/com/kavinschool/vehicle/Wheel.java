package com.kavinschool.vehicle;

/**
 * <p>Wheel class.</p>
 *
 * @author kangs
 */
public class Wheel {
    RimType rimType;
    double outerLipSize;
    double dropCenter;
    double plateSize;
    double numberOfSpokes;
    double numberOfLugHoles;
    double centerCapSize;
    double centerBoreSize;
    double centerDiscSize;
    double barrelSize;
    double wheelDiameterSize;
    WheelMadeType wheelMadeType;

    /**
     * <p>Constructor for Wheel.</p>
     *
     * @param wheelDiameterSize a double
     */
    public Wheel(double wheelDiameterSize) {
        this.wheelDiameterSize = wheelDiameterSize;
    }

    /**
     * <p>Getter for the field <code>rimType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.RimType} object
     */
    public RimType getRimType() {
        return rimType;
    }

    /**
     * <p>Setter for the field <code>rimType</code>.</p>
     *
     * @param rimType a {@link com.kavinschool.vehicle.RimType} object
     */
    public void setRimType(RimType rimType) {
        this.rimType = rimType;
    }

    /**
     * <p>Getter for the field <code>outerLipSize</code>.</p>
     *
     * @return a double
     */
    public double getOuterLipSize() {
        return outerLipSize;
    }

    /**
     * <p>Setter for the field <code>outerLipSize</code>.</p>
     *
     * @param outerLipSize a double
     */
    public void setOuterLipSize(double outerLipSize) {
        this.outerLipSize = outerLipSize;
    }

    /**
     * <p>Getter for the field <code>dropCenter</code>.</p>
     *
     * @return a double
     */
    public double getDropCenter() {
        return dropCenter;
    }

    /**
     * <p>Setter for the field <code>dropCenter</code>.</p>
     *
     * @param dropCenter a double
     */
    public void setDropCenter(double dropCenter) {
        this.dropCenter = dropCenter;
    }

    /**
     * <p>Getter for the field <code>plateSize</code>.</p>
     *
     * @return a double
     */
    public double getPlateSize() {
        return plateSize;
    }

    /**
     * <p>Setter for the field <code>plateSize</code>.</p>
     *
     * @param plateSize a double
     */
    public void setPlateSize(double plateSize) {
        this.plateSize = plateSize;
    }

    /**
     * <p>Getter for the field <code>numberOfSpokes</code>.</p>
     *
     * @return a double
     */
    public double getNumberOfSpokes() {
        return numberOfSpokes;
    }

    /**
     * <p>Setter for the field <code>numberOfSpokes</code>.</p>
     *
     * @param numberOfSpokes a double
     */
    public void setNumberOfSpokes(double numberOfSpokes) {
        this.numberOfSpokes = numberOfSpokes;
    }

    /**
     * <p>Getter for the field <code>numberOfLugHoles</code>.</p>
     *
     * @return a double
     */
    public double getNumberOfLugHoles() {
        return numberOfLugHoles;
    }

    /**
     * <p>Setter for the field <code>numberOfLugHoles</code>.</p>
     *
     * @param numberOfLugHoles a double
     */
    public void setNumberOfLugHoles(double numberOfLugHoles) {
        this.numberOfLugHoles = numberOfLugHoles;
    }

    /**
     * <p>Getter for the field <code>centerCapSize</code>.</p>
     *
     * @return a double
     */
    public double getCenterCapSize() {
        return centerCapSize;
    }

    /**
     * <p>Setter for the field <code>centerCapSize</code>.</p>
     *
     * @param centerCapSize a double
     */
    public void setCenterCapSize(double centerCapSize) {
        this.centerCapSize = centerCapSize;
    }

    /**
     * <p>Getter for the field <code>centerBoreSize</code>.</p>
     *
     * @return a double
     */
    public double getCenterBoreSize() {
        return centerBoreSize;
    }

    /**
     * <p>Setter for the field <code>centerBoreSize</code>.</p>
     *
     * @param centerBoreSize a double
     */
    public void setCenterBoreSize(double centerBoreSize) {
        this.centerBoreSize = centerBoreSize;
    }

    /**
     * <p>Getter for the field <code>centerDiscSize</code>.</p>
     *
     * @return a double
     */
    public double getCenterDiscSize() {
        return centerDiscSize;
    }

    /**
     * <p>Setter for the field <code>centerDiscSize</code>.</p>
     *
     * @param centerDiscSize a double
     */
    public void setCenterDiscSize(double centerDiscSize) {
        this.centerDiscSize = centerDiscSize;
    }

    /**
     * <p>Getter for the field <code>barrelSize</code>.</p>
     *
     * @return a double
     */
    public double getBarrelSize() {
        return barrelSize;
    }

    /**
     * <p>Setter for the field <code>barrelSize</code>.</p>
     *
     * @param barrelSize a double
     */
    public void setBarrelSize(double barrelSize) {
        this.barrelSize = barrelSize;
    }

    /**
     * <p>Getter for the field <code>wheelDiameterSize</code>.</p>
     *
     * @return a double
     */
    public double getWheelDiameterSize() {
        return wheelDiameterSize;
    }

    /**
     * <p>Setter for the field <code>wheelDiameterSize</code>.</p>
     *
     * @param wheelDiameterSize a double
     */
    public void setWheelDiameterSize(double wheelDiameterSize) {
        this.wheelDiameterSize = wheelDiameterSize;
    }

    /**
     * <p>Getter for the field <code>wheelMadeType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.WheelMadeType} object
     */
    public WheelMadeType getWheelMadeType() {
        return wheelMadeType;
    }

    /**
     * <p>Setter for the field <code>wheelMadeType</code>.</p>
     *
     * @param wheelMadeType a {@link com.kavinschool.vehicle.WheelMadeType} object
     */
    public void setWheelMadeType(WheelMadeType wheelMadeType) {
        this.wheelMadeType = wheelMadeType;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Wheel{" +
                "rimType=" + rimType +
                ", outerLipSize=" + outerLipSize +
                ", dropCenter=" + dropCenter +
                ", plateSize=" + plateSize +
                ", numberOfSpokes=" + numberOfSpokes +
                ", numberOfLugHoles=" + numberOfLugHoles +
                ", centerCapSize=" + centerCapSize +
                ", centerBoreSize=" + centerBoreSize +
                ", centerDiscSize=" + centerDiscSize +
                ", barrelSize=" + barrelSize +
                ", wheelDiameterSize=" + wheelDiameterSize +
                ", wheelMadeType=" + wheelMadeType +
                '}';
    }
}
