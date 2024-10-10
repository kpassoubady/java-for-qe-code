package com.kavinschool.junit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.JVM)
public class FixMethodOrderTest {

    @Test
    public void testA_FirstTest() {
        System.out.println("Running First Test");
        assertTrue(true);
    }

    @Test
    public void testB_SecondTest() {
        System.out.println("Running Second Test");
        assertTrue(true);
    }

    @Test
    public void testC_ThirdTest() {
        System.out.println("Running Third Test");
        assertTrue(true);
    }
}
