package com.kavinschool.vehicle;

/**
 * <p>Car class.</p>
 *
 * @author kangs
 */
public class Car extends Vehicle{
    private String make;
    private String model;
    private int year;

    VehicleState state;
    int numberOfSeatsPerCar;

    /**
     * <p>Constructor for Car.</p>
     */
    public Car() {
    }

    /**
     * <p>Constructor for Car.</p>
     *
     * @param make a {@link java.lang.String} object
     */
    public Car(String make) {
        this.make = make;
    }

    /**
     * <p>Constructor for Car.</p>
     *
     * @param make a {@link java.lang.String} object
     * @param model a {@link java.lang.String} object
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * <p>Constructor for Car.</p>
     *
     * @param make a {@link java.lang.String} object
     * @param model a {@link java.lang.String} object
     * @param year a int
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * <p>Constructor for Car.</p>
     *
     * @param make a {@link java.lang.String} object
     * @param model a {@link java.lang.String} object
     * @param year a int
     * @param state a {@link com.kavinschool.vehicle.VehicleState} object
     * @param numberOfSeatsPerCar a int
     */
    public Car(String make, String model, int year, VehicleState state, int numberOfSeatsPerCar) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.state = state;
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    /**
     * <p>Getter for the field <code>make</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getMake() {
        return make;
    }

    /**
     * <p>Getter for the field <code>model</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getModel() {
        return model;
    }

    /**
     * <p>Getter for the field <code>year</code>.</p>
     *
     * @return a int
     */
    public int getYear() {
        return year;
    }

    /**
     * <p>Setter for the field <code>make</code>.</p>
     *
     * @param make a {@link java.lang.String} object
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * <p>Setter for the field <code>model</code>.</p>
     *
     * @param model a {@link java.lang.String} object
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>Setter for the field <code>year</code>.</p>
     *
     * @param year a int
     */
    public void setYear(int year) {
        this.year = year;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", state=" + state +
                ", numberOfSeatsPerCar=" + numberOfSeatsPerCar +
                "} \n" + super.toString();
    }

    /** {@inheritDoc} */
    @Override
    public void start() {
        System.out.println("Car Started");
        this.state = VehicleState.STARTED;
    }

    /** {@inheritDoc} */
    @Override
    public void stop() {
        System.out.println("Car Stopped");
        this.state = VehicleState.STOPPED;

    }

    /** {@inheritDoc} */
    @Override
    public void drive() {
        System.out.println("Car Running");
        this.state = VehicleState.RUNNING;
    }

    /** {@inheritDoc} */
    @Override
    public VehicleState currentState() {
        return this.state;
    }

    /**
     * <p>Getter for the field <code>state</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.VehicleState} object
     */
    public VehicleState getState() {
        return state;
    }

    /**
     * <p>Setter for the field <code>state</code>.</p>
     *
     * @param state a {@link com.kavinschool.vehicle.VehicleState} object
     */
    public void setState(VehicleState state) {
        this.state = state;
    }

    /**
     * <p>Getter for the field <code>numberOfSeatsPerCar</code>.</p>
     *
     * @return a int
     */
    public int getNumberOfSeatsPerCar() {
        return numberOfSeatsPerCar;
    }

    /**
     * <p>Setter for the field <code>numberOfSeatsPerCar</code>.</p>
     *
     * @param numberOfSeatsPerCar a int
     */
    public void setNumberOfSeatsPerCar(int numberOfSeatsPerCar) {
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }
}
