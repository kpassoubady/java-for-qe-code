package com.kavinschool.basics.example;

public class DoWhile {

    public static void main(String args[]) {
        int count = 0;
        System.out.println("Before Loop Starts.");

        do {
            //if (count%2==0) continue;
            System.out.println("Current Value: " + count);
            if (count == 5) break;
        } while (++count <= 10);

        System.out.println("After Loop complete.");
    }
}