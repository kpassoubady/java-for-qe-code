package com.kavinschool.vehicle;

/**
 * <p>MotorCycle class.</p>
 *
 * @author kangs
 */
public class MotorCycle extends Vehicle{
    VehicleState state;
    Wheel wheel1;
    Wheel wheel2;

    /**
     * <p>Constructor for MotorCycle.</p>
     */
    public MotorCycle() {
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
     * <p>Getter for the field <code>wheel1</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Wheel} object
     */
    public Wheel getWheel1() {
        return wheel1;
    }

    /**
     * <p>Setter for the field <code>wheel1</code>.</p>
     *
     * @param wheel1 a {@link com.kavinschool.vehicle.Wheel} object
     */
    public void setWheel1(Wheel wheel1) {
        this.wheel1 = wheel1;
    }

    /**
     * <p>Getter for the field <code>wheel2</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Wheel} object
     */
    public Wheel getWheel2() {
        return wheel2;
    }

    /**
     * <p>Setter for the field <code>wheel2</code>.</p>
     *
     * @param wheel2 a {@link com.kavinschool.vehicle.Wheel} object
     */
    public void setWheel2(Wheel wheel2) {
        this.wheel2 = wheel2;
    }

    /**
     * <p>start.</p>
     */
    public void start() {
        System.out.println("MotorCycle Started");
        this.state = VehicleState.STARTED;
    }

    /** {@inheritDoc} */
    @Override
    public void stop() {
        System.out.println("MotorCycle Stopped");
        this.state = VehicleState.STOPPED;

    }

    /** {@inheritDoc} */
    @Override
    public void drive() {
        System.out.println("MotorCycle Running");
        this.state = VehicleState.RUNNING;
    }

    /** {@inheritDoc} */
    @Override
    public VehicleState currentState() {
        return this.state;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "MotorCycle{" +
                "state=" + state +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                "} " + super.toString();
    }
}
