package com.yourdomain.studentenrolment.student;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String class_;
	private String nationality;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String class_, String nationality) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.class_ = class_;
		this.nationality = nationality;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getClass_() {
		return class_;
	}

	public String getNationality() {
		return nationality;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
