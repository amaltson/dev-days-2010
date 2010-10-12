package org.devdays.shared;

import javax.persistence.Id;

public class Member {

	@Id
	private String irn;
	private String firstName, middleName, lastName, alternativeName;
	private Gender gender;

	@SuppressWarnings("unused")
	private Member() {
	}

	public Member(String irn, String firstName, String middleName,
			String lastName, String alternativeName, Gender gender) {
		this.irn = irn;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.alternativeName = alternativeName;
		this.gender = gender;
	}

	public String getIrn() {
		return irn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAlternativeName() {
		return alternativeName;
	}

	public Gender getGender() {
		return gender;
	}
}
