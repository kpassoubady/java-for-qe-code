package com.kavinschool.pigs;

public class DomesticAnimals {
    public static void main(String[] args) {
        Pig rosyPig = new Pig(); // Default constructor
        rosyPig.setName("Rosy");
        rosyPig.setColor("Red");
        rosyPig.setAge(4);

        System.out.println("rosyPig = " + rosyPig.toString());
        System.out.println("rosyPig.getName() = " + rosyPig.getName());
        System.out.println("rosyPig.getColor() = " + rosyPig.getColor());
        System.out.println("rosyPig.getAge() = " + rosyPig.getAge());
        rosyPig.profile();
        System.out.println("*".repeat(50));

        Pig kangsPig = new Pig("Kangs"); // Constructor with one argument - name
        kangsPig.setColor("brown");
        kangsPig.setAge(5);

        System.out.println("kangsPig = " + kangsPig);
        System.out.println("kangsPig.getName() = " + kangsPig.getName());
        System.out.println("kangsPig.getColor() = " + kangsPig.getColor());
        System.out.println("kangsPig.getAge() = " + kangsPig.getAge());

        Pig kavyaPig = new Pig("Kavya", "Purple"); // Constructor with two arguments - name and color
        kavyaPig.setAge(6);
        System.out.println("kavyaPig = " + kavyaPig);

        Pig kavinPig = new Pig("Kavin", "Yellow", 7); // Constructor with three arguments - name, color and age
        System.out.println("kavinPig = " + kavinPig.toString());
        kavinPig.setColor("Green");

        System.out.println("=".repeat(50));
        rosyPig.display();
        System.out.println("*".repeat(50));

        kangsPig.display();
        System.out.println("-".repeat(50));

        kavyaPig.display();
        System.out.println("#".repeat(50));

        kavinPig.display();
        System.out.println("!".repeat(50));


    }
}
