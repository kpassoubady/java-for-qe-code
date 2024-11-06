package com.kavinschool.animals;

public abstract class Mammal extends WarmBlooded{
    private boolean isMammal = true;
    protected int gestationPeriod;
    protected final boolean isHaveComplexBrain = true;
    protected final boolean isProduceMilk = true;
    protected final boolean isHaveUterus = true;

    public Mammal() {
    }

    public Mammal(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I'm Mammal");
    }
}
