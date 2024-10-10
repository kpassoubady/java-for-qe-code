package com.kavinschool.junit4;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class DataPointsAndTheoryTest {

    // Define DataPoints: an array of integers to be tested
    @DataPoints
    public static int [] dataPoints() {
        return new int[]{1, 2, 3, 4, 5};
    }

    @Theory
    public void testIsEven(int number) {
        System.out.println("Testing number: " + number);

        // Check if the number is even
        if (number % 2 == 0) {
            assertTrue(isEven(number));
        } else {
            assertFalse(isEven(number));
        }
    }

    // Helper method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
