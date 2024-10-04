package com.kavinschool.vehicle;


/**
 * <p>Door class.</p>
 *
 * @author kangs
 */
public class Door {
    CarWindow window;
    DoorState doorState;

    /**
     * <p>Getter for the field <code>window</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.CarWindow} object
     */
    public CarWindow getWindow() {
        return window;
    }

    /**
     * <p>Setter for the field <code>window</code>.</p>
     *
     * @param window a {@link com.kavinschool.vehicle.CarWindow} object
     */
    public void setWindow(CarWindow window) {
        this.window = window;
    }

    /**
     * <p>Constructor for Door.</p>
     *
     * @param window a {@link com.kavinschool.vehicle.CarWindow} object
     */
    public Door(CarWindow window) {
        this.window = window;
    }

    /**
     * <p>Constructor for Door.</p>
     *
     * @param window a {@link com.kavinschool.vehicle.CarWindow} object
     * @param doorState a {@link com.kavinschool.vehicle.DoorState} object
     */
    public Door(CarWindow window, DoorState doorState) {
        this.window = window;
        this.doorState = doorState;
    }

    /**
     * <p>open.</p>
     */
    public void open() {
        this.doorState = DoorState.OPEN;
        System.out.println("Door opened");
    }

    /**
     * <p>close.</p>
     */
    public void close() {
        this.doorState = DoorState.CLOSED;
        System.out.println("Door closed");
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Door{" +
                "window=" + window +
                ", doorState=" + doorState +
                '}';
    }
}
