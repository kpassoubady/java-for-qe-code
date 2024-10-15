package com.kavinschool.junit4;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class DataPointsEvenNumberTest {

    // Define DataPoints: an array of integers to be tested
    @DataPoints
    public static int[] numbers() {
        return new int[] {2, 4, 6, 7, 9, 10};
    }

    // Use a Theory to test with each data point
    @Theory
    public void testIsEven(int number) {
        System.out.println("Testing number: " + number);
        
        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println("Even number %  = " + number);
            assertTrue(isEven(number));
        } else {
            System.out.println("Odd number %  = " + number);
            assertFalse(isEven(number));
        }
    }

    // Helper method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

