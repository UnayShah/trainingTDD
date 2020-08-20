package com.DB.customerTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import com.remote.app.ILogin;
import com.remote.app.LoginApp;

@RunWith(MockitoJUnitRunner.class)
public class TestCustomerLogin {
	@Mock
	ILogin iLogin;
	
	@Test
	public void testMyLogin() {
		assertNotNull(iLogin);
		when(iLogin.getUserName()).thenReturn("Unay");
		LoginApp app = new LoginApp(iLogin);
		app.login("Unay");
	}
}
