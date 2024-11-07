package com.kavinschool.loops;

public class ForEachUsingStringArray {
    public static void main(String[] args) {
        String[] namesList = {"John", "Jane", "Jill", "Judy", "Joe"};
        System.out.println("Using for each loop");
        for (String name : namesList) {
            System.out.println("name = " + name);
        }
        System.out.println("Using traditional for loop");
        for (int i = 0; i < namesList.length; i++) {
            System.out.printf("name[%d]=%s\n", i, namesList[i]);
        }
    }
}
