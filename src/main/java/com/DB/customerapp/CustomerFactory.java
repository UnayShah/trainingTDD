package com.DB.customerapp;

public class CustomerFactory {
	public static ICustomerApp getCustomerApp() {
		return new CustomerAppImpl();
	}
}
