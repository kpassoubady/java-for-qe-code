package com.kavinschool.junit4;

import static org.junit.Assert.*;

import com.kavinschool.shape.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	Rectangle rectangle = null;

	@Before
	public void setUp() throws Exception {
		// Creating a new Rectangle object with length 5 and breadth 10
		// setup - initialization
		rectangle = new Rectangle(5, 10);
	}

	@After
	public void tearDown() throws Exception {
		// tear down - releasing the rectangle object
		rectangle = null;
	}

	@Test
	public final void testArea() {
		double expected = rectangle.area();
		double actual = 50;
		assertEquals("rectangle area does not match",expected, actual, 0.0);
	}

	@Test
	public final void testPerimeter() {
		double expected = rectangle.perimeter();
		double actual = 30;
		assertEquals("rectangle perimeter does not match",expected, actual, 0.0);
	}

}
