package com.kavinschool.vehicle;

public class Tire {
    private int maxRotation;
    private int totalAccumulatedRotation;
    private int pressure;

    private String manufacturerName;

    private double width;

    public Tire(int maxRotation, int totalAccumulatedRotation, int pressure) {
        this.maxRotation = maxRotation;
        this.totalAccumulatedRotation = totalAccumulatedRotation;
        this.pressure = pressure;
    }

    public Tire(int maxRotation, int totalAccumulatedRotation, int pressure, String manufacturerName) {
        this.maxRotation = maxRotation;
        this.totalAccumulatedRotation = totalAccumulatedRotation;
        this.pressure = pressure;
        this.manufacturerName = manufacturerName;
    }

    public int getMaxRotation() {
        return maxRotation;
    }

    public void setMaxRotation(int maxRotation) {
        this.maxRotation = maxRotation;
    }

    public int getTotalAccumulatedRotation() {
        return totalAccumulatedRotation;
    }

    public void setTotalAccumulatedRotation(int totalAccumulatedRotation) {
        this.totalAccumulatedRotation = totalAccumulatedRotation;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "maxRotation=" + maxRotation +
                ", totalAccumulatedRotation=" + totalAccumulatedRotation +
                ", pressure=" + pressure +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }

    public boolean isNeedTireChange() {
        return totalAccumulatedRotation <= maxRotation;
    }
}
