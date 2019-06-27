package com.poc.school.student.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.school.student.entity.ResponseStudentListForSchool;
import com.poc.school.student.entity.Student;

@RestController
public class StudentServiceContoller {

	// simple static database
	private static Map<String, List<Student>> schoolDB = new HashMap<String, List<Student>>();

	// Static initializing
	{
		List<Student> lst = new ArrayList<>();
		lst.add(new Student("Randika", "Grade V"));
//		lst.add(new Student("Nilwala", "Grade iV"));
		lst.add(new Student(null, null));

		schoolDB.put("School-I", lst);

		lst = new ArrayList<>();
		lst.add(new Student("Randika-II", "Grade x"));
		lst.add(new Student("Nilwala-II", "Grade ix"));

		schoolDB.put("School-II", lst);
	}

	@GetMapping("/students")
	public ResponseStudentListForSchool getStudentsOfSchool(@RequestParam String schoolName) {
		// TODO: handle non happy scenarios such as bad request (400) not found (404)
		return new ResponseStudentListForSchool(schoolDB.get(schoolName), schoolName);
	}

}
