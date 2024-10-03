package com.kavinschool.shape;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SquareOrderTest {

    Square instance;
    double side;
    double expResultArea, expResultPerimeter;

    public SquareOrderTest() {
        System.out.println("SquareOrderTest SquareOrderTest constructor");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("SquareOrderTest @BeforeMethod beforeMethod");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("SquareOrderTest @AfterMethod afterMethod");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.out.println("SquareOrderTest @BeforeClass beforeClass");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("SquareOrderTest @AfterClass afterClass");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("SquareOrderTest @BeforeTest beforeTest");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("SquareOrderTest @AfterTest afterTest");
    }

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("SquareOrderTest @BeforeSuite beforeSuite");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("SquareOrderTest @AfterSuite afterSuite");
    }

    @BeforeTest(alwaysRun = true)
    public void setUpGroupsFunctional() {
        System.out.println("SquareTest @BeforeGroups setUpGroups functional");
        side = 2.0;
        instance = new Square(side);
        expResultArea = 4.0;
        expResultPerimeter = 8.0;
        System.out.println(
                "Side: " + side + " expResultArea: " + expResultArea + " expResultPerimeter: " + expResultPerimeter);
    }

    @AfterTest(alwaysRun = true)
    public void tearDownGroupsFunctional() {
        System.out.println("SquareTest @AfterGroups tearDownGroups functional");
        instance = null;
    }

    @Test(groups = {"functional", "perimeter"})
    public void testPerimeter() {
        System.out.println("SquareOrderTest @Test testPerimeter Begins");
        double result = instance.perimeter();
        assertEquals(expResultPerimeter, result, 0.0);
        System.out.println("Side: " + side + " expResultPerimeter: " + expResultPerimeter + " ActualResult: " + result);
        System.out.println("SquareOrderTest @Test testPerimeter Ends");
    }

    @Test(groups = {"functional", "area"})
    public void testArea() {
        System.out.println("SquareOrderTest @Test testArea Begins");
        double result = instance.area();
        assertEquals(expResultArea, result, 0.0);
        System.out.println("Side: " + side + " expResultArea: " + expResultArea + " ActualResult: " + result);
        System.out.println("SquareOrderTest @Test testArea Ends");
    }
}
