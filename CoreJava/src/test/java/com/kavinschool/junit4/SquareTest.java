package com.kavinschool.junit4;

import static org.junit.Assert.*;

import com.kavinschool.shape.Square;
import org.junit.Test;

public class SquareTest {
	
	Square square = new Square(5);

	@Test
	public final void testArea() {
		double expected = square.area();
		double actual = 20;
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public final void testPerimeter() {
		double expected = square.perimeter();
		double actual = 10;
		assertEquals(expected, actual, 0.0);
	}

}
