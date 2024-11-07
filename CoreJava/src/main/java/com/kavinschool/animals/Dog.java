package com.kavinschool.animals;

public class Dog extends Mammal{
    private String name;
    private String breed;
    private int age;

    public Dog() {
        super();
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(int gestationPeriod, String name, String breed, int age) {
        super(gestationPeriod);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating meat, bones, and other food");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking, lol lol lol");
    }
}
