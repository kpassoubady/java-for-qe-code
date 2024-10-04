package com.kavinschool.vehicle;

/**
 * <p>TruckType class.</p>
 *
 * @author kangs
 */
public enum TruckType {
    DUMP_TRUCK(5000), TANKER(4000), FRIDGE(1000);
    private final int maxLoad;
    TruckType(int load) {
        this.maxLoad = load;
    }
    /**
     * <p>Getter for the field <code>maxLoad</code>.</p>
     *
     * @return a int
     */
    public int getMaxLoad() {
        return this.maxLoad;
    }
}

