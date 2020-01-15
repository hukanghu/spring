package com.huk;

public class Person {

	private String nameString;
	private String ageString;
	public String getNameString() {
		return nameString;
	}
	public Person(String nameString, String ageString) {
		super();
		this.nameString = nameString;
		this.ageString = ageString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAgeString() {
		return ageString;
	}
	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}
}
