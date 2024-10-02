package com.kavinschool.vehicle;

public class ElectricCar extends Coupe {

    Tire tire1;
    Tire tire2;
    Brake brake;
    private boolean isTouchScreenAvailable;
    private boolean isParkingAssistanceCameraAvailable;
    int numberOfBatteries;


    public ElectricCar(Door door1, Door door2) {
        super(door1, door2);
    }

    public Tire getTire1() {
        return tire1;
    }

    public void setTire1(Tire tire1) {
        this.tire1 = tire1;
    }

    public Tire getTire2() {
        return tire2;
    }

    public void setTire2(Tire tire2) {
        this.tire2 = tire2;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public boolean isTouchScreenAvailable() {
        return isTouchScreenAvailable;
    }

    public void setTouchScreenAvailable(boolean touchScreenAvailable) {
        isTouchScreenAvailable = touchScreenAvailable;
    }

    public boolean isParkingAssistanceCameraAvailable() {
        return isParkingAssistanceCameraAvailable;
    }

    public void setParkingAssistanceCameraAvailable(boolean parkingAssistanceCameraAvailable) {
        isParkingAssistanceCameraAvailable = parkingAssistanceCameraAvailable;
    }

    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "tire1=" + tire1 +
                ", tire2=" + tire2 +
                ", brake=" + brake +
                ", isTouchScreenAvailable=" + isTouchScreenAvailable +
                ", isParkingAssistanceCameraAvailable=" + isParkingAssistanceCameraAvailable +
                ", numberOfBatteries=" + numberOfBatteries +
                "} \n" + super.toString();
    }
}
