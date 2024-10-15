package com.kavinschool.junit4;

import com.kavinschool.shape.OrderTest;
import com.kavinschool.shape.SquareTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OrderTest.class, RectangleTest.class, SquareTest.class })
public class AllJUnitTests {

}
