package com.kavinschool.pattern;

import java.util.StringJoiner;

/**
 * <p>Car class.</p>
 *
 * @author kangs
 */
public class Car {

    private final String color;
    private final int currentSpeed;
    private final int year;
    private final int wheels;
    private final String make;
    private final String model;
    private final int maximumSpeed;
    private final int fuelCapacity;

    private Car(final Builder builder) {
        color = builder.color;
        currentSpeed = builder.currentSpeed;
        year = builder.year;
        wheels = builder.wheels;
        make = builder.make;
        model = builder.model;
        maximumSpeed = builder.maximumSpeed;
        fuelCapacity = builder.fuelCapacity;
    }

    /**
     * <p>newBuilder.</p>
     *
     * @return a {@link com.kavinschool.pattern.Car.Builder} object
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * <p>newBuilder.</p>
     *
     * @param copy a {@link com.kavinschool.pattern.Car} object
     * @return a {@link com.kavinschool.pattern.Car.Builder} object
     */
    public static Builder newBuilder(final Car copy) {
        Builder builder = new Builder();
        builder.color = copy.getColor();
        builder.currentSpeed = copy.getCurrentSpeed();
        builder.year = copy.getYear();
        builder.wheels = copy.getWheels();
        builder.make = copy.getMake();
        builder.model = copy.getModel();
        builder.maximumSpeed = copy.getMaximumSpeed();
        builder.fuelCapacity = copy.getFuelCapacity();
        return builder;
    }

    /**
     * <p>Getter for the field <code>color</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getColor() {
        return color;
    }

    /**
     * <p>Getter for the field <code>currentSpeed</code>.</p>
     *
     * @return a int
     */
    public int getCurrentSpeed() {
        return currentSpeed;
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
     * <p>Getter for the field <code>wheels</code>.</p>
     *
     * @return a int
     */
    public int getWheels() {
        return wheels;
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
     * <p>Getter for the field <code>maximumSpeed</code>.</p>
     *
     * @return a int
     */
    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * <p>Getter for the field <code>fuelCapacity</code>.</p>
     *
     * @return a int
     */
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * {@code Car} builder static inner class.
     */
    public static final class Builder {
        private String color;
        private int currentSpeed;
        private int year;
        private int wheels;
        private String make;
        private String model;
        private int maximumSpeed;
        private int fuelCapacity;

        private Builder() {
        }

        /**
         * Sets the {@code color} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param color the {@code color} to set
         * @return a reference to this Builder
         */
        public Builder withColor(final String color) {
            this.color = color;
            return this;
        }

        /**
         * Sets the {@code currentSpeed} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param currentSpeed the {@code currentSpeed} to set
         * @return a reference to this Builder
         */
        public Builder withCurrentSpeed(final int currentSpeed) {
            this.currentSpeed = currentSpeed;
            return this;
        }

        /**
         * Sets the {@code year} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param year the {@code year} to set
         * @return a reference to this Builder
         */
        public Builder withYear(final int year) {
            this.year = year;
            return this;
        }

        /**
         * Sets the {@code wheels} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param wheels the {@code wheels} to set
         * @return a reference to this Builder
         */
        public Builder withWheels(final int wheels) {
            this.wheels = wheels;
            return this;
        }

        /**
         * Sets the {@code make} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param make the {@code make} to set
         * @return a reference to this Builder
         */
        public Builder withMake(final String make) {
            this.make = make;
            return this;
        }

        /**
         * Sets the {@code model} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param model the {@code model} to set
         * @return a reference to this Builder
         */
        public Builder withModel(final String model) {
            this.model = model;
            return this;
        }

        /**
         * Sets the {@code maximumSpeed} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param maximumSpeed the {@code maximumSpeed} to set
         * @return a reference to this Builder
         */
        public Builder withMaximumSpeed(final int maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
            return this;
        }

        /**
         * Sets the {@code fuelCapacity} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param fuelCapacity the {@code fuelCapacity} to set
         * @return a reference to this Builder
         */
        public Builder withFuelCapacity(final int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
            return this;
        }

        /**
         * Returns a {@code Car} built from the parameters previously set.
         *
         * @return a {@code Car} built with parameters of this {@code Car.Builder}
         */
        public Car build() {
            return new Car(this);
        }
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("color='" + color + "'")
                .add("currentSpeed=" + currentSpeed)
                .add("year=" + year)
                .add("wheels=" + wheels)
                .add("make='" + make + "'")
                .add("model='" + model + "'")
                .add("maximumSpeed=" + maximumSpeed)
                .add("fuelCapacity=" + fuelCapacity)
                .toString();
    }
}
