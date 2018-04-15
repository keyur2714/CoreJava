package com.sms.action;

import java.util.Scanner;

import com.sms.dto.Student;
import com.sms.service.StudentService;

public class StudentDriver {

	public static void main(String[] args) {
		System.out.println("Student Management System...!");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Student Id: ");
		int id = scanner.nextInt();
		
		System.out.print("Enter Student Name: ");
		String name = scanner.next();
		
		System.out.print("Enter Student City: ");
		String city = scanner.next();
		
		System.out.print("Enter Student MobileNo: ");
		String mobileNo = scanner.next();
		
		Student student1 = new Student(id,name,city,mobileNo); //create object using default constructor
		
		Student student2 = new Student();
		
//		student1.setId(id);
//		student1.setName(name);
//		student1.setCity(city);
//		student1.setMobileNo(mobileNo);

		StudentService studentService = new StudentService();
		studentService.printStudentInfo(student1);
		
	}

}
