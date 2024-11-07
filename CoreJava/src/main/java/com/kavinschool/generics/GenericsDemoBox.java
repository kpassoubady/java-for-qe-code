package com.kavinschool.generics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}


public class GenericsDemoBox {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Integer Value: " + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello World");
        System.out.println("String Value: " + stringBox.getItem());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(10.5);
        System.out.println("Double Value: " + doubleBox.getItem());
    }
}   // End of GenericsDemo