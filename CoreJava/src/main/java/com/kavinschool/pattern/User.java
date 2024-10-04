package com.kavinschool.pattern;

import java.util.StringJoiner;

/**
 * <p>User class.</p>
 *
 * @author kangs
 */
public class User {
    private String firstName;
    private String lastName;
    private String userId;
    private String password;
    private String email;
    private boolean isEnabled;

    /**
     * <p>Constructor for User.</p>
     *
     * @param firstName a {@link java.lang.String} object
     * @param lastName a {@link java.lang.String} object
     */
    public User(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * <p>Constructor for User.</p>
     *
     * @param firstName a {@link java.lang.String} object
     * @param lastName a {@link java.lang.String} object
     * @param userId a {@link java.lang.String} object
     * @param password a {@link java.lang.String} object
     */
    public User(final String firstName, final String lastName, final String userId, final String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.password = password;
    }

    /**
     * <p>Constructor for User.</p>
     *
     * @param firstName a {@link java.lang.String} object
     * @param lastName a {@link java.lang.String} object
     * @param userId a {@link java.lang.String} object
     * @param password a {@link java.lang.String} object
     * @param email a {@link java.lang.String} object
     * @param isEnabled a boolean
     */
    public User(final String firstName, final String lastName, final String userId, final String password, final String email, final boolean isEnabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.isEnabled = isEnabled;
    }

    /**
     * <p>Getter for the field <code>firstName</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>Setter for the field <code>firstName</code>.</p>
     *
     * @param firstName a {@link java.lang.String} object
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>Getter for the field <code>lastName</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>Setter for the field <code>lastName</code>.</p>
     *
     * @param lastName a {@link java.lang.String} object
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>Getter for the field <code>userId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>Setter for the field <code>userId</code>.</p>
     *
     * @param userId a {@link java.lang.String} object
     */
    public void setUserId(final String userId) {
        this.userId = userId;
    }

    /**
     * <p>Getter for the field <code>password</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>Setter for the field <code>password</code>.</p>
     *
     * @param password a {@link java.lang.String} object
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * <p>Getter for the field <code>email</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>Setter for the field <code>email</code>.</p>
     *
     * @param email a {@link java.lang.String} object
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * <p>isEnabled.</p>
     *
     * @return a boolean
     */
    public boolean isEnabled() {
        return isEnabled;
    }

    /**
     * <p>setEnabled.</p>
     *
     * @param enabled a boolean
     */
    public void setEnabled(final boolean enabled) {
        isEnabled = enabled;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("userId='" + userId + "'")
                .add("password='" + password + "'")
                .add("email='" + email + "'")
                .add("isEnabled=" + isEnabled)
                .toString();
    }
}
