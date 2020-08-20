package com.remote.app;

public class LoginApp {
	private ILogin login;

	public LoginApp(ILogin login) {
		this.login = login;
	}

	public void login(String userName) {
		String userNameFromDB = login.getUserName();
		if (userNameFromDB != null && !userNameFromDB.equals(userName)) {
			throw new RuntimeException("Exception occured");
		} else {
			System.out.println("Logged in successfully");
		}
	}
}