package com.kavinschool.basics.example;

public class BreakWithLabelExample {
    public static void main(String[] args) {
        // Defining a label for the outer loop
        outerLoop:
        for (int i = 1; true; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of outer loop");
                    break outerLoop; // Breaks the outer loop labeled as 'outerLoop'
                }
            }
        }
        System.out.println("Loop exited.");
    }
}
