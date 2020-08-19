package com.DB.customerapp;

import java.util.Random;

public class CustomerAppImpl implements ICustomerApp{

	@Override
	public Customer createCustomer(Customer customer) {
		System.out.println("Customer created successfully");
		customer.setId(new Random().nextLong());
		return customer;
	}

}
