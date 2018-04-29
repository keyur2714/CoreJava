package com.demo.dto;

public class HondaCar extends Car{
	
	private String logo;
	
	public HondaCar(String logo,String color,int price){
		super(color,price);
		this.logo=logo;
	}
	public void setCarModel(String carModel){
		this.carModel = carModel;
	}
	public void displayCarDetails() {
		super.displayCarDetails();
		System.out.println("Logo: "+this.logo);
	}
}
