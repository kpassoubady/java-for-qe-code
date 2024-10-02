package com.kavinschool.arrays;

public class AgeArray {
    public static void main(String[] args) {
        int length = 10;
        int[] agesArray = new int[length];
        for (int i = 0; i < agesArray.length; i++) {
            agesArray[i] = (int) (Math.random() * 110);
        }
        for (int age : agesArray) {
            System.out.println("age = " + age);
        }
    }
}
