package org.devdays.shared;

import javax.persistence.Id;

public class Customer {

	@Id
	private String id;
	private String firstName, lastName;

	@SuppressWarnings("unused")
	private Customer() {
	}

	public Customer(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
