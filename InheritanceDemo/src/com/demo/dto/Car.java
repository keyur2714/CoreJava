package com.demo.dto;

public class Car extends Vehicle{
	protected String carModel;
	public Car(String color,int price){
		super(color,price);
	}	
	public void setCarModel(String carModel){
		this.carModel = carModel;
	}
	public void displayCarDetails(){
		super.displayCarDetails();
		System.out.println("Model : "+this.carModel);
	}
	
}
