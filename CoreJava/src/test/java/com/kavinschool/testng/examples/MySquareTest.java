package com.kavinschool.testng.examples;

import com.kavinschool.shape.Square;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MySquareTest{
    Square square = null;

    @BeforeMethod
    public void setUp() {
        square = new Square(5);
    }

    @AfterMethod
    public void tearDown() {
        square = null;
    }

    @Test
    public void testArea() {
        double expected = 25.0;
        double actual = square.area();
        assertEquals(actual, expected, 0.0);
    }

    @Test
    public void testPerimeter() {
        double expected = 20.0;
        double actual = square.perimeter();
        assertEquals(actual, expected, 0.0);
    }

}