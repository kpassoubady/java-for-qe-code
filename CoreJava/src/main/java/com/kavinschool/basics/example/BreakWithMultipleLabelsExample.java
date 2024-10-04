package com.kavinschool.basics.example;

public class BreakWithMultipleLabelsExample {
    public static void main(String[] args) {
        // Label for the outermost loop
        outerLoop:
        for (int i = 1; true; i++) {
            // Label for the inner loop
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);

                // Condition to break out of the inner loop
                if (i == 1 && j == 2) {
                    System.out.println("Breaking out of inner loop");
                    break innerLoop; // Break only the inner loop
                }

                // Condition to break out of the outer loop
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of outer loop");
                    break outerLoop; // Break the outer loop
                }
            }
        }
        System.out.println("Loops exited.");
    }
}
