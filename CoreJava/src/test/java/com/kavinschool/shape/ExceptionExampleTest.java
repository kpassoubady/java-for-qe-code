package com.kavinschool.shape;

import org.testng.annotations.Test;

public class ExceptionExampleTest {
    @Test(expectedExceptions = ArithmeticException.class)
    public void testExceptions() {
        int a = 10 / 0;
        System.out.println("a = " + a);
    }
}
