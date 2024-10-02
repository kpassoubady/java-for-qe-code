package com.kavinschool.vehicle;

public enum TruckType {
    DUMP_TRUCK(5000), TANKER(4000), FRIDGE(1000);
    private int maxLoad;
    private TruckType (int load) {
        this.maxLoad = load;
    }
    public int getMaxLoad() {
        return this.maxLoad;
    }
}

