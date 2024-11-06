package com.kavinschool.pigs;

public abstract class Animal {
    // Abstract method
    public abstract void eat();
    // Abstract method
    public abstract void speak();

    protected int haveLegs = 0;

    // Example for non-abstract method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void display() {
        System.out.println("I'm Animal");
    }
}
