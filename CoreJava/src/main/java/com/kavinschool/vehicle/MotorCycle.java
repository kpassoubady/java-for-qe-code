package com.kavinschool.vehicle;

public class MotorCycle extends Vehicle{
    VehicleState state;
    Wheel wheel1;
    Wheel wheel2;

    public MotorCycle() {
    }

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public void setWheel1(Wheel wheel1) {
        this.wheel1 = wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public void setWheel2(Wheel wheel2) {
        this.wheel2 = wheel2;
    }

    public void start() {
        System.out.println("MotorCycle Started");
        this.state = VehicleState.STARTED;
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle Stopped");
        this.state = VehicleState.STOPPED;

    }

    @Override
    public void drive() {
        System.out.println("MotorCycle Running");
        this.state = VehicleState.RUNNING;
    }

    @Override
    public VehicleState currentState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "state=" + state +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                "} " + super.toString();
    }
}
