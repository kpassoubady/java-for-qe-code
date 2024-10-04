package com.kavinschool.vehicle;

/**
 * <p>ElectricCar class.</p>
 *
 * @author kangs
 */
public class ElectricCar extends Coupe {

    Tire tire1;
    Tire tire2;
    Brake brake;
    private boolean isTouchScreenAvailable;
    private boolean isParkingAssistanceCameraAvailable;
    int numberOfBatteries;


    /**
     * <p>Constructor for ElectricCar.</p>
     *
     * @param door1 a {@link com.kavinschool.vehicle.Door} object
     * @param door2 a {@link com.kavinschool.vehicle.Door} object
     */
    public ElectricCar(Door door1, Door door2) {
        super(door1, door2);
    }

    /**
     * <p>Getter for the field <code>tire1</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Tire} object
     */
    public Tire getTire1() {
        return tire1;
    }

    /**
     * <p>Setter for the field <code>tire1</code>.</p>
     *
     * @param tire1 a {@link com.kavinschool.vehicle.Tire} object
     */
    public void setTire1(Tire tire1) {
        this.tire1 = tire1;
    }

    /**
     * <p>Getter for the field <code>tire2</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Tire} object
     */
    public Tire getTire2() {
        return tire2;
    }

    /**
     * <p>Setter for the field <code>tire2</code>.</p>
     *
     * @param tire2 a {@link com.kavinschool.vehicle.Tire} object
     */
    public void setTire2(Tire tire2) {
        this.tire2 = tire2;
    }

    /**
     * <p>Getter for the field <code>brake</code>.</p>
     *
     * @return a {@link com.kavinschool.vehicle.Brake} object
     */
    public Brake getBrake() {
        return brake;
    }

    /**
     * <p>Setter for the field <code>brake</code>.</p>
     *
     * @param brake a {@link com.kavinschool.vehicle.Brake} object
     */
    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    /**
     * <p>isTouchScreenAvailable.</p>
     *
     * @return a boolean
     */
    public boolean isTouchScreenAvailable() {
        return isTouchScreenAvailable;
    }

    /**
     * <p>setTouchScreenAvailable.</p>
     *
     * @param touchScreenAvailable a boolean
     */
    public void setTouchScreenAvailable(boolean touchScreenAvailable) {
        isTouchScreenAvailable = touchScreenAvailable;
    }

    /**
     * <p>isParkingAssistanceCameraAvailable.</p>
     *
     * @return a boolean
     */
    public boolean isParkingAssistanceCameraAvailable() {
        return isParkingAssistanceCameraAvailable;
    }

    /**
     * <p>setParkingAssistanceCameraAvailable.</p>
     *
     * @param parkingAssistanceCameraAvailable a boolean
     */
    public void setParkingAssistanceCameraAvailable(boolean parkingAssistanceCameraAvailable) {
        isParkingAssistanceCameraAvailable = parkingAssistanceCameraAvailable;
    }

    /**
     * <p>Getter for the field <code>numberOfBatteries</code>.</p>
     *
     * @return a int
     */
    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    /**
     * <p>Setter for the field <code>numberOfBatteries</code>.</p>
     *
     * @param numberOfBatteries a int
     */
    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "ElectricCar{" +
                "tire1=" + tire1 +
                ", tire2=" + tire2 +
                ", brake=" + brake +
                ", isTouchScreenAvailable=" + isTouchScreenAvailable +
                ", isParkingAssistanceCameraAvailable=" + isParkingAssistanceCameraAvailable +
                ", numberOfBatteries=" + numberOfBatteries +
                "} \n" + super.toString();
    }
}
