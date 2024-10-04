package com.kavinschool.vehicle;

/**
 * <p>Commuter class.</p>
 *
 * @author kangs
 */
public class Commuter extends Train{
    VehicleState state;
    int numberOfSeatsPerCar;

    /**
     * <p>Constructor for Commuter.</p>
     *
     * @param engine a {@link java.lang.String} object
     * @param numberOfCars a int
     * @param name a {@link java.lang.String} object
     */
    public Commuter(String engine, int numberOfCars, String name) {
        super(engine, numberOfCars, name);
    }

    /**
     * <p>Constructor for Commuter.</p>
     *
     * @param engine a {@link java.lang.String} object
     * @param numberOfCars a int
     * @param name a {@link java.lang.String} object
     * @param state a {@link com.kavinschool.vehicle.VehicleState} object
     * @param numberOfSeatsPerCar a int
     */
    public Commuter(String engine, int numberOfCars, String name, VehicleState state, int numberOfSeatsPerCar) {
        super(engine, numberOfCars, name);
        this.state = state;
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    /** {@inheritDoc} */
    @Override
    public void start() {
        System.out.println("Started");
        this.state = VehicleState.STARTED;
    }

    /** {@inheritDoc} */
    @Override
    public void stop() {
        System.out.println("Stopped");
        this.state = VehicleState.STOPPED;

    }

    /** {@inheritDoc} */
    @Override
    public void drive() {
        System.out.println("Running");
        this.state = VehicleState.RUNNING;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Commuter{" +
                "state=" + state +
                ", numberOfSeatsPerCar=" + numberOfSeatsPerCar +
                "} \n" + super.toString();
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

    /** {@inheritDoc} */
    @Override
    public VehicleState currentState() {
        return this.state;
    }
}
