package com.kavinschool.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

// Advantages of LinkedHashSet:
// 1. It maintains the insertion order of elements.
// 2. It allows null elements.
// 3. It does not allow duplicate elements.
// 4. It is not synchronized.
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> viewedProducts = new LinkedHashSet<>();
        viewedProducts.add("PROD123");
        viewedProducts.add("PROD456");
        viewedProducts.add("PROD123");  // Duplicate, will not be added again

        System.out.println(viewedProducts);  // Output: [PROD123, PROD456]

    }
}
