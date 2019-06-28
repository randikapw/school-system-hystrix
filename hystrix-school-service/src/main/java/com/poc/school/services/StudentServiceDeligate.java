package com.poc.school.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class StudentServiceDeligate {

	private static final String URI_GET_STUDENTS = "http://localhost:8070/students";
	private static final String PARAM_KEY_GET_STUDENTS = "schoolName";

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getStudentsFallback")
	public String getStudents(String schoolName) {

		// Setting up Uri builder with query params
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(URI_GET_STUDENTS)
				// set query params
				.queryParam(PARAM_KEY_GET_STUDENTS, schoolName);

		// **Use below link to see how to add path variables to UriComponentBuilder
		// https://stackoverflow.com/questions/35998790/resttemplate-how-to-send-url-and-query-parameters-together?answertab=votes#tab-top

		String result = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, String.class).getBody();

		return result;
	}

	public String getStudentsFallback(String schoolName) {
		return "Hystrix fall back";
	}

}
