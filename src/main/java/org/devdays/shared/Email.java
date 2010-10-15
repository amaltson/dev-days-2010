package org.devdays.shared;

import java.io.Serializable;

public class Email implements Serializable {

	private String email;

	public Email() {
	}

	public Email(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
