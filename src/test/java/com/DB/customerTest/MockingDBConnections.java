package com.DB.customerTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockingDBConnections {
	public MockingDBConnections() {
		System.out.println("Constructor called.");
	}

	@Mock
	Connection connection;

	@Mock
	PreparedStatement preparedStatement;

	@Mock
	ResultSet resultSet;
	@BeforeClass
	public static void setupOnce() {
		System.out.println("Gets called only once, before the tests run.");
	}

	@AfterClass
	public static void teardownOnce() {
		System.out.println("Gets called only once, after the tests run.");
	}


	@After
	public void teardown() {
		System.out.println("This method is called after every testcase.");
	}

	
	@Before
	public void setup() throws Throwable {
		// test Double Mocked Object setup
		when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
		when(preparedStatement.executeQuery()).thenReturn(resultSet);
		when(resultSet.next()).thenReturn(true);
		when(resultSet.getString("userName")).thenReturn("unayshah");
		when(resultSet.getString("password")).thenReturn("abcdefgh");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
		assert true;
	};

	@Test
	public void test2() {
		System.out.println("Test2");
		assert true;
	};

	@Test
	public void testSomething() throws Throwable {
		assertNotNull(connection);
		preparedStatement = connection.prepareStatement("select * from users");
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			String userName = resultSet.getString("userName");
			String password = resultSet.getString("password");
			System.out.println("Username: " + userName);
			System.out.println("Password :" + password);
		}

	}
}