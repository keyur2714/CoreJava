package com.sms.service;

import com.sms.dto.Student;

public class StudentService {

	
	public void printStudentInfo(Student student){
		System.out.println(student.getId()+" "+student.getName()+" "+student.getCity()+" "+student.getMobileNo());
	}
	
}
