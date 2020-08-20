package com.DB.customerTest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;
import org.junit.Test;

import com.DB.customerapp.Customer;
import com.DB.customerapp.InvalidValueException;

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

	@Test(expected = InvalidValueException.class)
	public void testCustomerNameShortLengthNegative() {
		Customer customer = new Customer();
		customer.setFirstName("un");
		int expected = 3;
		int actual = customer.getFirstName().length();
		assertTrue(actual >= expected);
	}
	
	@Test(expected = InvalidValueException.class)
	public void testCustomerNameNotLettersNegative() {
		Customer customer = new Customer();
		customer.setFirstName("Un2y");
		int expected = 3;
		int actual = customer.getFirstName().length();
		assertTrue(actual >= expected);
	}

	@Test
	public void testCustomerNameFirstLetterNotCapitalPositive() {
		Customer customer = new Customer();
		customer.setFirstName("uNay");
		int expected = 3;
		int actual = customer.getFirstName().length();
		assertTrue(actual >= expected);
	}


	@Test
	public void testCustomerNameActualPositive() {
		Customer customer = new Customer();
		customer.setFirstName("Unay");
		int expected = 3;
		int actual = customer.getFirstName().length();
		assertTrue(actual >= expected);
	}

	@Test
	@Ignore
	public void testCustomerLastName() {
		fail();
	}

	@Test
	@Ignore
	public void testCustomerNameValidChars() {
		fail();
	}

	@Test
	@Ignore
	public void testCustomerLastNameValidChars() {
		fail();
	}

	@Test
	@Ignore
	public void testCustomerNameMinLength() {
		fail();
	}

	@Test
	@Ignore
	public void testCustomerLastNameMinLength() {
		fail();
	}

	@Test
	@Ignore
	public void testCustomerValidEmailId() {
		fail();
	}
}