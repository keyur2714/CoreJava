package com.demo.dto;

public class Vehicle {
	private String color;
	private int price;
	public Vehicle(String color, int price) {
		super();
		this.color = color;		
		this.price = price;
	}
	public void displayCarDetails(){
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);	
	}	
}
