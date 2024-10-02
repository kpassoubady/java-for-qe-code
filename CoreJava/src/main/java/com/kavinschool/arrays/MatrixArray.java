package com.kavinschool.arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] WeeksWeather = new int[7][24];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                WeeksWeather[i][j] = (int) (Math.random() * 110);
            }
        }

        for (int[] dailyWeather : WeeksWeather) {
            for (int hourlyWeather : dailyWeather) {
                System.out.println("hourlyWeather = " + hourlyWeather);
            }
        }
    }
}
