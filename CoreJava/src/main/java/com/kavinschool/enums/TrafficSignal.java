package com.kavinschool.enums;

public enum TrafficSignal {
    RED(40, "STOP") {
        public TrafficSignal nextSignal() {
            return GREEN;
        }
    }, YELLOW(10, "PREPARE TO STOP") {
        public TrafficSignal nextSignal() {
            return RED;
        }
    }, GREEN(30, "GO") {
        public TrafficSignal nextSignal() {
            return YELLOW;
        }
    };

    public abstract TrafficSignal nextSignal();

    private final int seconds;
    private final String action;

    TrafficSignal(int seconds, String action) {
        this.seconds = seconds;
        this.action = action;
    }

    int getSeconds() {
        return seconds;
    }

    String getAction() {
        return action;
    }
    public static void main(String[] args) {
        for (TrafficSignal light : TrafficSignal.values()) {
            System.out.printf("%s: %d seconds, action needed %s, nextSignal is %s\n", light,
                    light.getSeconds(), light.getAction(),light.nextSignal());
        }

        TrafficSignal signal[] = TrafficSignal.values();
        for (var curSignal:signal) {
            System.out.printf("The index of %s is %s \n", curSignal.name(), curSignal.ordinal());
        }

        System.out.println(TrafficSignal.valueOf("GREEN"));
        System.out.println(TrafficSignal.valueOf("RED"));
        TrafficSignal yellow = TrafficSignal.valueOf("YELLOW");
        System.out.println(yellow.nextSignal());
        System.out.println(yellow.ordinal());
        System.out.println(yellow.name());
    }
}

