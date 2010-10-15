package org.devdays.shared;

import java.io.Serializable;

import javax.persistence.Id;

@SuppressWarnings("serial")
public class Customer implements Serializable {

	@Id
	private String id;
	private String firstName, lastName;
	private Address address;
	private Email email;

	public Customer() {
	}

	public Customer(String id, String firstName, String lastName,
			Address address, Email email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
}
