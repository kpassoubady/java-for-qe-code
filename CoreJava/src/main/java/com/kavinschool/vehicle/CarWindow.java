package com.kavinschool.vehicle;

/**
 * <p>CarWindow class.</p>
 *
 * @author kangs
 */
public class CarWindow {
    GlassType glassType;
    /**
     * <p>pullDown.</p>
     */
    public void pullDown() {
        System.out.println("Window is down");
    }

    /**
     * <p>pullUp.</p>
     */
    public void pullUp() {
        System.out.println("Window is up");
    }

    /**
     * <p>Constructor for CarWindow.</p>
     *
     * @param glassType a {@link com.kavinschool.vehicle.GlassType} object
     */
    public CarWindow(GlassType glassType) {
        this.glassType = glassType;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "CarWindow{" +
                "glassType=" + glassType +
                '}';
    }
}
