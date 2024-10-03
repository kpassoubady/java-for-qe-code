package com.kavinschool.collections.lists;

// create an example for List interface
// List is an ordered collection of elements
// It allows duplicate elements
// It provides index-based access to elements
// It is implemented by ArrayList, LinkedList, and Vector classes

import java.util.ArrayList; // import ArrayList class
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(); // create an object of ArrayList
        arrayList.add("Java"); // add elements to the arrayList
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add("C#");
        System.out.println("List of elements: " + arrayList); // print the arrayList of elements
    }
}
