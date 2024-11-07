package com.kavinschool.loops;

public class ForIteration {
    public static void main(String[] args) {
        System.out.println("Normal Order");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Reverse Order");
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }
}
