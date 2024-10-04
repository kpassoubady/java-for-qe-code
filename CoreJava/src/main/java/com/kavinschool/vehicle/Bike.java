package com.kavinschool.vehicle;

/**
 * <p>Bike class.</p>
 *
 * @author kangs
 */
public class Bike extends Vehicle {
    private HandleBarType handleBarType;
    private BikeType bikeType;
    private VehicleState state;

    /**
     * <p>Constructor for Bike.</p>
     *
     * @param handleBarType a {@link com.kavinschool.vehicle.HandleBarType} object
     * @param bikeType a {@link com.kavinschool.vehicle.BikeType} object
     */
    public Bike(HandleBarType handleBarType, BikeType bikeType) {
        this.handleBarType = handleBarType;
        this.bikeType = bikeType;
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
     * <p>Getter for the field <code>handleBarType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.HandleBarType} object
     */
    public HandleBarType getHandleBarType() {
        return handleBarType;
    }

    /**
     * <p>Setter for the field <code>handleBarType</code>.</p>
     *
     * @param handleBarType a {@link com.kavinschool.vehicle.HandleBarType} object
     */
    public void setHandleBarType(HandleBarType handleBarType) {
        this.handleBarType = handleBarType;
    }

    /**
     * <p>Getter for the field <code>bikeType</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.BikeType} object
     */
    public BikeType getBikeType() {
        return bikeType;
    }

    /**
     * <p>Setter for the field <code>bikeType</code>.</p>
     *
     * @param bikeType a {@link com.kavinschool.vehicle.BikeType} object
     */
    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Bike{" +
                "handleBarType=" + handleBarType +
                ", bikeType=" + bikeType +
                ", state=" + state +
                "} \n" + super.toString();
    }
}
