package com.DB.customerapp;

public class Customer {
	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private int age;
	private String gender;
	private String location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	/**
	 * 1. Checking whether firstName is null and has required length. 2. Check
	 * whether all characters are letters. 3. If name is not in title case(first
	 * letter upper case, remaining lower case), then change it to lower case.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() <= 2) {
			throw new InvalidValueException();
		}

		for (Character character : firstName.toCharArray()) {
			if (!Character.isLetter(character)) {
				throw new InvalidValueException();
			}
		}

		if (!Character.isUpperCase(firstName.charAt(0))) {
			firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1).toLowerCase();
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
