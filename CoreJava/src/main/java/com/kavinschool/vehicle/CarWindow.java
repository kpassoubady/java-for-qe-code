package com.kavinschool.vehicle;

public class CarWindow {
    GlassType glassType;
    public void pullDown() {
        System.out.println("Window is down");
    }

    public void pullUp() {
        System.out.println("Window is up");
    }

    public CarWindow(GlassType glassType) {
        this.glassType = glassType;
    }

    @Override
    public String toString() {
        return "CarWindow{" +
                "glassType=" + glassType +
                '}';
    }
}
