package com.kavinschool.vehicle;

public abstract class Train extends Vehicle {
    private String engine;
    private int numberOfCars;
    private String name;

    public Train(String engine, int numberOfCars, String name) {
        this.engine = engine;
        this.numberOfCars = numberOfCars;
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "engine='" + engine + '\'' +
                ", numberOfCars=" + numberOfCars +
                ", name='" + name + '\'' +
                "} \n" + super.toString();
    }
}
