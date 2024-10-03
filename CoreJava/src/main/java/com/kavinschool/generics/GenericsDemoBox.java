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
    }
}   // End of GenericsDemo