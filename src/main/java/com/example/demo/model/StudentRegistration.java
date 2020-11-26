package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentRegistration {
	private List<Student> studentList = new ArrayList<>();

	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	public List<Student> getStudents(){
		return studentList;
	}
	
	public void deleteStudent(int id) {
		for(Student s : studentList) {
			if(id == s.getId()) {
				studentList.remove(s);
			}
		}
	}
}
