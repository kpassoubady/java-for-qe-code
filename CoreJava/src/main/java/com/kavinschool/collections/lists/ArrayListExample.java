package com.kavinschool.collections.lists;

// create an example for List interface
// List is an ordered collection of elements
// It allows duplicate elements
// It provides index-based access to elements
// It is implemented by ArrayList, LinkedList, and Vector classes

import java.util.ArrayList; // import ArrayList class
/**
 * <p>ArrayListExample class.</p>
 *
 * @author kangs
 */
public class ArrayListExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
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
