package com.kavinschool.vehicle;

public class Convertibles extends Car{
    Door door1;
    Door door2;
    RoofType roofType;
    RoofState roofState;

    public Convertibles(Door door1, Door door2, RoofType roofType, RoofState roofState) {
        this.door1 = door1;
        this.door2 = door2;
        this.roofType = roofType;
        this.roofState = roofState;
    }

    public Door getDoor1() {
        return door1;
    }

    public void setDoor1(Door door1) {
        this.door1 = door1;
    }

    public Door getDoor2() {
        return door2;
    }

    public void setDoor2(Door door2) {
        this.door2 = door2;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    public RoofState getRoofState() {
        return roofState;
    }

    public void setRoofState(RoofState roofState) {
        this.roofState = roofState;
    }

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
