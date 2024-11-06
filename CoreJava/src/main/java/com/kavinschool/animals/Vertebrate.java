package com.kavinschool.animals;


// Superclass Animal
// Subclass or child class Vertebrate
public abstract class Vertebrate extends Animal {
    // Non-Abstract method
    @Override
    public void display() {
        super.display();
        System.out.println("I'm Vertebrate");
    }
}
