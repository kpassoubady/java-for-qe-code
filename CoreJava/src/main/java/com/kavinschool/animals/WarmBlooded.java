package com.kavinschool.animals;

public abstract class WarmBlooded extends Vertebrate{
    private boolean isWarmBlooded = true;
    @Override
    public void display() {
        super.display();
        System.out.println("I'm WarmBlooded");
    }
}
