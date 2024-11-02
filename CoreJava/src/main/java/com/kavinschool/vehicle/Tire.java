package com.kavinschool.vehicle;

/**
 * <p>Tire class.</p>
 *
 * @author kangs
 */
public class Tire {
    private int maxRotation;
    private int totalAccumulatedRotation;
    private int pressure;

    private String manufacturerName;

    //private double width;

    /**
     * <p>Constructor for Tire.</p>
     *
     * @param maxRotation a int
     * @param totalAccumulatedRotation a int
     * @param pressure a int
     */
    public Tire(int maxRotation, int totalAccumulatedRotation, int pressure) {
        this.maxRotation = maxRotation;
        this.totalAccumulatedRotation = totalAccumulatedRotation;
        this.pressure = pressure;
    }

    /**
     * <p>Constructor for Tire.</p>
     *
     * @param maxRotation a int
     * @param totalAccumulatedRotation a int
     * @param pressure a int
     * @param manufacturerName a {@link java.lang.String} object
     */
    public Tire(int maxRotation, int totalAccumulatedRotation, int pressure, String manufacturerName) {
        this.maxRotation = maxRotation;
        this.totalAccumulatedRotation = totalAccumulatedRotation;
        this.pressure = pressure;
        this.manufacturerName = manufacturerName;
    }

    /**
     * <p>Getter for the field <code>maxRotation</code>.</p>
     *
     * @return a int
     */
    public int getMaxRotation() {
        return maxRotation;
    }

    /**
     * <p>Setter for the field <code>maxRotation</code>.</p>
     *
     * @param maxRotation a int
     */
    public void setMaxRotation(int maxRotation) {
        this.maxRotation = maxRotation;
    }

    /**
     * <p>Getter for the field <code>totalAccumulatedRotation</code>.</p>
     *
     * @return a int
     */
    public int getTotalAccumulatedRotation() {
        return totalAccumulatedRotation;
    }

    /**
     * <p>Setter for the field <code>totalAccumulatedRotation</code>.</p>
     *
     * @param totalAccumulatedRotation a int
     */
    public void setTotalAccumulatedRotation(int totalAccumulatedRotation) {
        this.totalAccumulatedRotation = totalAccumulatedRotation;
    }

    /**
     * <p>Getter for the field <code>pressure</code>.</p>
     *
     * @return a int
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * <p>Setter for the field <code>pressure</code>.</p>
     *
     * @param pressure a int
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    /**
     * <p>Getter for the field <code>manufacturerName</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * <p>Setter for the field <code>manufacturerName</code>.</p>
     *
     * @param manufacturerName a {@link java.lang.String} object
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Tire{" +
                "maxRotation=" + maxRotation +
                ", totalAccumulatedRotation=" + totalAccumulatedRotation +
                ", pressure=" + pressure +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }

    /**
     * <p>isNeedTireChange.</p>
     *
     * @return a boolean
     */
    public boolean isNeedTireChange() {
        return totalAccumulatedRotation <= maxRotation;
    }
}
