package com.kavinschool.testng.examples;

import org.testng.Assert;
import org.testng.annotations.*;

public class OrderTest {
    @BeforeClass
    public void login() {
        System.out.println("-".repeat(50));
        System.out.println("@BeforeClass OrderTest.login");
    }

    @AfterClass
    public void logout() {
        System.out.println("@AfterClass OrderTest.logout");
        System.out.println("-".repeat(50));
    }

    @Test(groups = {"form", "functional"})
    public void testFormFill() {
        System.out.println("@Test OrderTest.testFormFill");
        Assert.assertEquals(10, 20, "Expected 10 but found 20");
    }

    @Test(dependsOnMethods = {"testFormFill"})
    public void testOrderFill() {
        System.out.println("@Test OrderTest.testOrderFill");
    }

    @Test(dependsOnMethods = {"testOrderFill"})
    public void testIssueInsurance() {
        System.out.println("@Test OrderTest.testIssueInsurance");
    }
}
