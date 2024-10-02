package com.kavinschool.vehicle;

public class Brake {
    BrakeType brakeType;
    BrakePadType brakePadType;

    public Brake(BrakeType brakeType, BrakePadType brakePadType) {
        this.brakeType = brakeType;
        this.brakePadType = brakePadType;
    }

    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }

    public BrakePadType getBrakePadType() {
        return brakePadType;
    }

    public void setBrakePadType(BrakePadType brakePadType) {
        this.brakePadType = brakePadType;
    }

    @Override
    public String toString() {
        return "Brake{" +
                "brakeType=" + brakeType +
                ", brakePadType=" + brakePadType +
                '}';
    }
}
