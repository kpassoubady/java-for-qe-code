package com.kavinschool.testng.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyOrderTest {

    @BeforeMethod
    public void setUpBrowser() {
        System.out.println("-".repeat(50));
        System.out.println("@BeforeMethod MyOrderTest.setUpBrowser");
    }

    @AfterMethod
    public void tearDownBrowser() {
        System.out.println("@AfterMethod MyOrderTest.tearDownBrowser");
        System.out.println("-".repeat(50));
    }

    @Test
    public void testApple() {
        System.out.println("@Test MyOrderTest.testApple");
    }

    @Test
    public void testBanana() {
        System.out.println("@Test MyOrderTest.testBanana");
    }

    @Test
    public void testCherry() {
        System.out.println("@Test MyOrderTest.testCherry");
    }
}