package com.kavinschool.enums;

public class VerifyChar {
    public static void main(String[] args) {
        System.out.println("\u2663, \u2666, \u2665, \u2660 ");

        //use the below logic to print 40 unicode chars per line
        char unicode = '\u0000';

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.printf("%4s",unicode++);
            }
            System.out.println();
        }
    }
}
