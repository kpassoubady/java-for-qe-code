package com.kavinschool.corejava.enums;

public class DietSchedule {

    public static void main(String[] args) {

        int option = (int) (Math.random() * 7.0);
        System.out.println("Option:" + option);

        WeekDays whichDay =  WeekDays.values()[option];
        // MON = 0, TUE = 1

        switch (whichDay) {
            case MONDAY: System.out.println("Monday");
            case TUESDAY: System.out.println("Tuesday");
            case THURSDAY: System.out.println("Thursday");
            case SATURDAY: System.out.println("Saturday");
                System.out.println(" Vegitarian");
                break;
            case WEDNESDAY: System.out.println("Wednesday");
            case FRIDAY: System.out.println("Friday");
            case SUNDAY: System.out.println("Sunday");
                System.out.println(" Non Vegitarian");
                break;
            default: System.out.println("Are you on earth?");
                break;
        }
    }
}
