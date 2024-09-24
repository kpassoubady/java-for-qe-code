package com.kavinschool.corejava.collections.list.examples;

// create an example for List interface
// List is an ordered collection of elements
// It allows duplicate elements
// It provides index-based access to elements
// It is implemented by ArrayList, LinkedList, and Vector classes

import java.util.ArrayList; // import ArrayList class
public class List1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // create an object of ArrayList
        list.add("Java"); // add elements to the list
        list.add("Python");
        list.add("C++");
        list.add("Java");
        list.add("C#");
        System.out.println("List of elements: " + list); // print the list of elements
    }
}
