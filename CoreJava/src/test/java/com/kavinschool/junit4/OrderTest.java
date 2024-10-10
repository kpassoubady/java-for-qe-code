package com.kavinschool.junit4;

import static org.junit.Assert.*;

import com.kavinschool.shape.Square;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass - OrderTest.setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass - OrderTest.tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before - OrderTest.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After - OrderTest.tearDown()");
	}

	@Test
	public void testApple() {
		System.out.println("@Test - OrderTest.testApple()");
		// The below will pass because the Strings are same.
		assertEquals("Comparing Apple to Apple","Apple", "Apple");
		// The below will fail because the Strings are different.
		assertEquals("Comparing Apple to Apple","Apple", "Maple");
		// The below will fail because the integers are different value.
		assertEquals("Comparing 1 to 10",1, 10);
	}
	
	@Test
	public void testBanana() {
		System.out.println("@Test - OrderTest.testBanana()");
		assertTrue("Comparing 1 > 10 - failed", 1 > 10);
	}
	
	@Test
	public void testCherry() {
		System.out.println("@Test - OrderTest.testCherry()");
		assertFalse("Comparing 1 < 10 - failed", 1 < 10);
	}
	
	@Test
	public void testDate() {
		System.out.println("@Test - OrderTest.testDate()");
		assertNotNull("Date is not null", new java.util.Date());
	}
	
	@Test
	public void testEggplant() {
		System.out.println("@Test - OrderTest.testEggplant()");
		Square square = null;
		assertNull("Eggplant is null", square);
		square = new Square(5);
		assertNotNull("Eggplant is not null", square);
	}
	
	@Test
	public void testFig() {
		System.out.println("@Test - OrderTest.testFig()");
		Square square = new Square(5);
		// assertSame is used to check if both the references are pointing to the same object.
		assertSame("Comparing Square to Square", square, square);
		Square square2 = new Square(10);
		// the below will pass because square and square2 are different objects.
		assertNotSame("Comparing Square to Square2", square, square2);
		
		Square square3 = square;
		// the below will pass because square and square3 are same objects.
		assertSame("Comparing Square to Square3", square, square3);
		Square square4 = square;
		// the below will fail because square and square4 are different objects.
		assertSame("Comparing Square to Square4", square2, square4);
		//Assert.asserAll("All the asserts passed");
	}

}
