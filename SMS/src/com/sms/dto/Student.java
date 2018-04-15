package com.sms.dto;

public class Student {

	private int id;
	private String name;
	private String city;
	private String mobileNo;
	
	public Student(){	
		System.out.println("I am from student...");
	}
	
	public Student(int id,String name,String city,String mobileNo){
		System.out.println("From constructor:  "+id+" "+name+" "+city+" "+mobileNo);
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
