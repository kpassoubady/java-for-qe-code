package com.kavinschool.pet.store.tests;

public class StringFormatterExamples {

    public static void main(String[] args) {
        System.out.printf("My name is %s my age is %d\n", "Kangs", 12);
        System.out.printf("I have %1$d kids their ages are %1$d %1$d %1$d\n",3);
        System.out.printf("I have %1$d kids their ages are %1$d %2$d %3$d\n",3,20,40);

    }
}
