package com.kavinschool.vehicle;

/**
 * <p>Abstract Train class.</p>
 *
 * @author kangs
 */
public abstract class Train extends Vehicle {
    private String engine;
    private int numberOfCars;
    private String name;

    /**
     * <p>Constructor for Train.</p>
     *
     * @param engine a {@link java.lang.String} object
     * @param numberOfCars a int
     * @param name a {@link java.lang.String} object
     */
    public Train(String engine, int numberOfCars, String name) {
        this.engine = engine;
        this.numberOfCars = numberOfCars;
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>engine</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>Setter for the field <code>engine</code>.</p>
     *
     * @param engine a {@link java.lang.String} object
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>Getter for the field <code>numberOfCars</code>.</p>
     *
     * @return a int
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * <p>Setter for the field <code>numberOfCars</code>.</p>
     *
     * @param numberOfCars a int
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object
     */
    public void setName(String name) {
        this.name = name;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Train{" +
                "engine='" + engine + '\'' +
                ", numberOfCars=" + numberOfCars +
                ", name='" + name + '\'' +
                "} \n" + super.toString();
    }
}
