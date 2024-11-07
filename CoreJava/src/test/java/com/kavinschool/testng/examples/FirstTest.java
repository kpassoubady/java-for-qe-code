package com.kavinschool.testng.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 1)
    public void testFirst() {
        System.out.println("FirstTest.testFirst");
        Assert.assertTrue(5 > 10, "5 is not greater than 10");
    }

    @Test(priority = 20)
    public void testSecond() {
        System.out.println("FirstTest.testSecond");
    }

    @Test(priority = 30)
    public void testThird() {
        System.out.println("FirstTest.testThird");
    }

    @Test(priority = 4)
    public void testFourth() {
        System.out.println("FirstTest.testFourth");
    }

    @Test(priority = -5)
    public void testFifth() {
        System.out.println("FirstTest.testFifth");
    }
}
