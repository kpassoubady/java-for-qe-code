package com.kavinschool.vehicle;


public class Door {
    CarWindow window;
    DoorState doorState;

    public CarWindow getWindow() {
        return window;
    }

    public void setWindow(CarWindow window) {
        this.window = window;
    }

    public Door(CarWindow window) {
        this.window = window;
    }

    public Door(CarWindow window, DoorState doorState) {
        this.window = window;
        this.doorState = doorState;
    }

    public void open() {
        this.doorState = DoorState.OPEN;
        System.out.println("Door opened");
    }

    public void close() {
        this.doorState = DoorState.CLOSED;
        System.out.println("Door closed");
    }

    @Override
    public String toString() {
        return "Door{" +
                "window=" + window +
                ", doorState=" + doorState +
                '}';
    }
}
