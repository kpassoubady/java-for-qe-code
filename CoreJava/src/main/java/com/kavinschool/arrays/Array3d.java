package com.kavinschool.arrays;

import java.util.Arrays;

public class Array3d {
    public static void main(String[] args) {
        Integer[][][] array3d = new Integer[5][5][5];
        //Store in a 3d array
        System.out.println("Creating 3D array with values 0 to 99");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    array3d[i][j][k] = (int) (Math.random() * 100);
                    System.out.printf("array3d[%d][%d][%d]=%d\t", i,j,k,array3d[i][j][k]);
                }
            }
        }

        System.out.println("\narray3d = " + array3d);
        System.out.println("Arrays.deepToString(array3d) = " + Arrays.deepToString(array3d));

        System.out.println("Other ways to access 3D array");
        for (int i = 0; i < array3d.length; i++) {
            Integer[][] array2d = array3d[i];
            for (int j = 0; j < array2d.length; j++) {
                Integer[] array1d = array2d[j];
                for (int k = 0; k < array1d.length; k++) {
                    Integer value = array1d[k];
                    System.out.println("value = " + value);
                }
            }
        }
    }
}
