package com.kavinschool.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedSumTest {

    private final int number1;
    private final int number2;
    private final int expectedSum;

    // Constructor to initialize the test parameters
    public ParameterizedSumTest(int number1, int number2, int expectedSum) {
        this.number1 = number1;
        this.number2 = number2;
        this.expectedSum = expectedSum;
    }

    // Define the data set for parameterized test
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 1, 1, 2 },
            { 2, 3, 5 },
            { 3, 3, 6 },
            { 5, 5, 10 },
            { 9, 1, 10 }
        });
    }

    // Test method that will be executed with each data set
    @Test
    public void testSum() {
        assertEquals(expectedSum, sum(number1, number2));
    }

    // Helper method to calculate the sum
    private int sum(int a, int b) {
        return a + b;
    }
}
