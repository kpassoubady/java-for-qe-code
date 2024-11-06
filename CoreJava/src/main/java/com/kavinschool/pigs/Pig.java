package com.kavinschool.pigs;
            // subclass extends superclass
public class Pig extends Mammal {
    private String name;
    private String color;
    private int age;
    int gestationPeriod = 115;

    // Default constructor - No arguments constructor
    public Pig() {
        super();
    }

    // Constructor with one argument - name
    public Pig(String name) {
        this.name = name;
    }

    // Constructor with two arguments - name and color
    public Pig(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Constructor with three arguments - name, color and age
    public Pig(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Constructor with four arguments - gestationPeriod, name, color and age
    // constructor with superclass Mammal's gestationPeriod



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Pig is eating carrots, corn, and other vegetables");
    }

    @Override
    public void speak() {
        System.out.println("Pig is saying Oink Oink");
    }

    public void display() {
        super.display();
        System.out.println("I'm Pig");
    }

    public void profile() {
        this.display();
        super.haveLegs = 4;
        if (super.isHaveComplexBrain) {
            System.out.println("I have a complex brain");
        }
        if (super.isProduceMilk) {
            System.out.println("I produce milk");
        }
        if (super.isHaveUterus) {
            System.out.println("I have a uterus");
        }
        friendsWith();
    }

    private void friendsWith() {
        System.out.println("friendsWith human beings");
    }
}
