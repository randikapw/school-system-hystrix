package com.poc.school.student.entity;

import java.util.List;

public class ResponseStudentListForSchool extends ResponseTemplate<List<Student>> {

	String school;

	public ResponseStudentListForSchool(List<Student> data, String school) {
		super(data);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
