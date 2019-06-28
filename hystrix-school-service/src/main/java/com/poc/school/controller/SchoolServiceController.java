package com.poc.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc.school.services.StudentServiceDeligate;

@RestController
public class SchoolServiceController {
	
	private static final String PATH_VAR_SCHOOL_NAME = "schoolName";
	private static final String URI_GET_SCHOOLS = "/schools/" + PATH_VAR_SCHOOL_NAME;
	private static final String URI_GET_STUDENTS_OF_SCHOOL = "/schools/{" + PATH_VAR_SCHOOL_NAME + "}/students";
	
	@Autowired
	StudentServiceDeligate studentServiceDeligate;

	@GetMapping(URI_GET_STUDENTS_OF_SCHOOL)
	public String getStudentsOfSchool(@PathVariable(value=PATH_VAR_SCHOOL_NAME) String schoolName) {
		return studentServiceDeligate.getStudents(schoolName);
	} 
}
