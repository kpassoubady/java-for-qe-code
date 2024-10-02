package com.kavinschool.vehicle;

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

    public Wheel(double wheelDiameterSize) {
        this.wheelDiameterSize = wheelDiameterSize;
    }

    public RimType getRimType() {
        return rimType;
    }

    public void setRimType(RimType rimType) {
        this.rimType = rimType;
    }

    public double getOuterLipSize() {
        return outerLipSize;
    }

    public void setOuterLipSize(double outerLipSize) {
        this.outerLipSize = outerLipSize;
    }

    public double getDropCenter() {
        return dropCenter;
    }

    public void setDropCenter(double dropCenter) {
        this.dropCenter = dropCenter;
    }

    public double getPlateSize() {
        return plateSize;
    }

    public void setPlateSize(double plateSize) {
        this.plateSize = plateSize;
    }

    public double getNumberOfSpokes() {
        return numberOfSpokes;
    }

    public void setNumberOfSpokes(double numberOfSpokes) {
        this.numberOfSpokes = numberOfSpokes;
    }

    public double getNumberOfLugHoles() {
        return numberOfLugHoles;
    }

    public void setNumberOfLugHoles(double numberOfLugHoles) {
        this.numberOfLugHoles = numberOfLugHoles;
    }

    public double getCenterCapSize() {
        return centerCapSize;
    }

    public void setCenterCapSize(double centerCapSize) {
        this.centerCapSize = centerCapSize;
    }

    public double getCenterBoreSize() {
        return centerBoreSize;
    }

    public void setCenterBoreSize(double centerBoreSize) {
        this.centerBoreSize = centerBoreSize;
    }

    public double getCenterDiscSize() {
        return centerDiscSize;
    }

    public void setCenterDiscSize(double centerDiscSize) {
        this.centerDiscSize = centerDiscSize;
    }

    public double getBarrelSize() {
        return barrelSize;
    }

    public void setBarrelSize(double barrelSize) {
        this.barrelSize = barrelSize;
    }

    public double getWheelDiameterSize() {
        return wheelDiameterSize;
    }

    public void setWheelDiameterSize(double wheelDiameterSize) {
        this.wheelDiameterSize = wheelDiameterSize;
    }

    public WheelMadeType getWheelMadeType() {
        return wheelMadeType;
    }

    public void setWheelMadeType(WheelMadeType wheelMadeType) {
        this.wheelMadeType = wheelMadeType;
    }

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
