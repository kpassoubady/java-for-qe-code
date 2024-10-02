package com.kavinschool.enums;

public enum NewWeekDays {
    //Assign specific value for your constants
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int day;
    NewWeekDays(int whichDay) {
        day = whichDay;
    }

    public int getDay() {
        return day;
    }
}
