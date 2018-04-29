package com.demo.dto;

public class HyundaiCar extends Car {
	private String logo;
	public HyundaiCar(String logo,String color,int price){
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
