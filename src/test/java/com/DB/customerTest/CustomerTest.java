package com.DB.customerTest;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class CustomerTest {

	/*
	 * BeforeClass and AfterClass need to be static as called only once
	 */

	@BeforeClass
	public static void setupOnce() {
		System.out.println("Gets called only once, before the tests run.");
	}

	@AfterClass
	public static void teardownOnce() {
		System.out.println("Gets called only once, after the tests run.");
	}

	@Before
	public void setup() {
		System.out.println("This method is called before every testcase.");
	}

	@After
	public void teardown() {
		System.out.println("This method is called after every testcase.");
	}

	@Test
	public void testCustomerName() {
		fail();
	}

	@Test
	public void testCustomerLastName() {
		fail();
	}

	@Test
	public void testCustomerNameValidChars() {
		fail();
	}

	@Test
	public void testCustomerLastNameValidChars() {
		fail();
	}

	@Test
	public void testCustomerNameMinLength() {
		fail();
	}

	@Test
	public void testCustomerLastNameMinLength() {
		fail();
	}

	@Test
	public void testCustomerValidEmailId() {
		fail();
	}
}
