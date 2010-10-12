package org.devdays.shared;

public enum Gender {
	MALE("M"), FEMALE("F");
	
	private String shortForm;
	private Gender(String shortForm) {
		this.shortForm = shortForm;
	}
	
	public String toShortForm() {
		return shortForm;
	}
}
