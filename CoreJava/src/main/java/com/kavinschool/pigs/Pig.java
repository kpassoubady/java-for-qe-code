package com.kavinschool.pigs;

public class Pig {
    private String name;
    private String color;
    private int age;

    // Default constructor - No arguments constructor
    public Pig() {
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
}
