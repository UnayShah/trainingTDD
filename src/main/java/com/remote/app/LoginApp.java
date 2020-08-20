package com.remote.app;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.DB.customerapp.InvalidValueException;

public class LoginApp {
	private ILogin login;

	public LoginApp(ILogin login) {
		this.login = login;
	}

	public void login(String userName) {
		String userNameFromDB = login.getUserName();
		if (userNameFromDB != null && !userNameFromDB.equals(userName)) {
			throw new InvalidValueException();
		} else {
			LogManager lgmngr = LogManager.getLogManager();
	        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	        log.log(Level.INFO, "Logged in successfully");
		}
	}
}