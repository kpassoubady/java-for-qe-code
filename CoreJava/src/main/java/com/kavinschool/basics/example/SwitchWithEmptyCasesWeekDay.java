package com.kavinschool.basics.example;

public class SwitchWithEmptyCasesWeekDay {
    public static void main(String[] args) {
        int day = (int) (Math.random() * 10.0);
        System.out.println("Day:" + day);
        String dayString;
        switch (day) {
            case 1:
            case 2:
                dayString = "Monday & Tuesday - Vegetarian";
                break;
            case 3:
            case 4:
                dayString = "Wednesday & Thursday - Non Vegetarian";
                break;
            case 5:
            case 6:
                dayString = "Friday & Saturday - Juice Day";
                break;
            case 7:
                dayString = "Sunday - Fasting";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        System.out.println(dayString);
    }
}
