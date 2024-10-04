package com.kavinschool.pattern;

/**
 * <p>AddressBuilder class.</p>
 *
 * @author kangs
 */
public class AddressBuilder {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    /**
     * <p>Setter for the field <code>addressLine1</code>.</p>
     *
     * @param addressLine1 a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setAddressLine1(final String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * <p>Setter for the field <code>addressLine2</code>.</p>
     *
     * @param addressLine2 a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setAddressLine2(final String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * <p>Setter for the field <code>city</code>.</p>
     *
     * @param city a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setCity(final String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>Setter for the field <code>state</code>.</p>
     *
     * @param state a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setState(final String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>Setter for the field <code>zipCode</code>.</p>
     *
     * @param zipCode a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setZipCode(final String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * <p>Setter for the field <code>country</code>.</p>
     *
     * @param country a {@link java.lang.String} object
     * @return a {@link com.kavinschool.pattern.AddressBuilder} object
     */
    public AddressBuilder setCountry(final String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>createAddress.</p>
     *
     * @return a {@link com.kavinschool.pattern.Address} object
     */
    public Address createAddress() {
        return new Address(addressLine1, addressLine2, city, state, zipCode, country);
    }
}
