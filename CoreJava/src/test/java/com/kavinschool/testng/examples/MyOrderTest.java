package com.kavinschool.testng.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyOrderTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpBrowser() {
        System.out.println("-".repeat(50));
        System.out.println("@BeforeMethod MyOrderTest.setUpBrowser");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBrowser() {
        System.out.println("@AfterMethod MyOrderTest.tearDownBrowser");
        System.out.println("-".repeat(50));
    }

    @Test(groups = {"smoke", "apple"})
    public void testApple() {
        System.out.println("@Test MyOrderTest.testApple");
    }

    @Test(groups = {"smoke", "banana"})
    public void testBanana() {
        System.out.println("@Test MyOrderTest.testBanana");
    }

    @Test(groups = {"smoke", "cherry"})
    public void testCherry() {
        System.out.println("@Test MyOrderTest.testCherry");
    }
}