package com.poc.school.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class StudentServiceDeligate {
	
	private static final String URI_GET_STUDENTS = "http://localhost:8080/students";
	private static final String PARAM_KEY_GET_STUDENTS = "schoolName";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getStudents(String schoolName) {
		
		return null;
	}
	
}
