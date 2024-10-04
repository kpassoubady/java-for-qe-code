package com.kavinschool.pattern;

import java.util.StringJoiner;

/**
 * <p>Address class.</p>
 *
 * @author kangs
 */
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    /**
     * <p>Constructor for Address.</p>
     *
     * @param addressLine1 a {@link java.lang.String} object
     * @param addressLine2 a {@link java.lang.String} object
     * @param city a {@link java.lang.String} object
     * @param state a {@link java.lang.String} object
     * @param zipCode a {@link java.lang.String} object
     * @param country a {@link java.lang.String} object
     */
    public Address(final String addressLine1, final String addressLine2, final String city, final String state, final String zipCode, final String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    /**
     * <p>Getter for the field <code>addressLine1</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * <p>Getter for the field <code>addressLine2</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * <p>Getter for the field <code>city</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>Getter for the field <code>state</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getState() {
        return state;
    }

    /**
     * <p>Getter for the field <code>zipCode</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * <p>Getter for the field <code>country</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getCountry() {
        return country;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("addressLine1='" + addressLine1 + "'")
                .add("addressLine2='" + addressLine2 + "'")
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("zipCode='" + zipCode + "'")
                .add("country='" + country + "'")
                .toString();
    }
}
