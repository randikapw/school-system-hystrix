package com.poc.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc.school.services.StudentServiceDeligate;

@RestController
public class SchoolServiceController {
	
	private static final String PATH_VAR_SCHOOL_NAME = "{schoolName}";
	private static final String URI_GET_SCHOOLS = "/schools/" + PATH_VAR_SCHOOL_NAME;
	
	@Autowired
	StudentServiceDeligate studentServiceDeligate;

	@GetMapping(URI_GET_SCHOOLS)
	public String getStudentsOfSchool(@PathVariable(name=PATH_VAR_SCHOOL_NAME) String schoolName) {
		return studentServiceDeligate.getStudents(schoolName);
	} 
}
