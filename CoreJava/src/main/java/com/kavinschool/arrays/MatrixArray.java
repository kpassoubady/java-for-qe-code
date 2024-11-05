package com.kavinschool.arrays;

/**
 * <p>MatrixArray class.</p>
 *
 * @author kangs
 */
public class MatrixArray {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
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
        System.out.println("====================================");

        System.out.println("WeeksWeather[0][0] = " + WeeksWeather[0][0]);
        System.out.println("WeeksWeather[0][1] = " + WeeksWeather[0][1]);
        System.out.println("WeeksWeather[1][1] = " + WeeksWeather[1][1]);
        System.out.println("WeeksWeather[6][23] = " + WeeksWeather[6][23]);

        System.out.println("====================================");
        System.out.println("WeeksWeather.length = " + WeeksWeather.length); // row length - 7
        System.out.println("WeeksWeather[0].length = " + WeeksWeather[0].length); // column length - 24
        System.out.println("====================================");

        for (int i = 0; i < WeeksWeather.length; i++) {
            System.out.printf("Day %d\n",i);
            for (int j = 0; j < WeeksWeather[i].length; j++) {
                System.out.printf("WeeksWeather[%d][%d] = %d\n", i, j, WeeksWeather[i][j]);
            }
        }
        System.out.println("====================================");
    }
}