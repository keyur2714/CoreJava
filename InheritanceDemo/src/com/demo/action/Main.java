package com.demo.action;

import sun.misc.PerfCounter;

import com.demo.dto.Address;
import com.demo.dto.Contact;
import com.demo.dto.HondaCar;
import com.demo.dto.HyundaiCar;
import com.demo.dto.Person;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi...");
		HondaCar hondaCar = new HondaCar("H","Red",120000);
		hondaCar.setCarModel("IVtech");
		hondaCar.displayCarDetails();
		
		
		HyundaiCar hyundaiCar = new HyundaiCar("h","White",800000);
		hyundaiCar.setCarModel("I20");
		hyundaiCar.displayCarDetails();
		
		System.out.println("============");
		
		Person person1 = new Person();
		person1.setPid(27l);
		person1.setName("Keyur");
		
		Address person1Address=new Address();
		person1Address.setAddress1("Alcove Society-A-1106");
		person1Address.setAddress2("Kunal Icon Road,Pimple Saudagar");
		person1Address.setCity("Pune");
		person1Address.setState("Maharashtra");
		person1Address.setCountry("India");
		person1Address.setPinCode("411207");
		
		person1.setAddress(person1Address);
		
		Contact person1Contact = new Contact();
		person1Contact.setMobileNo("7387029671");
		person1Contact.setEmailId("keyurjava27@gmail.com");
		
		person1.setContact(person1Contact);
		
		System.out.println(person1.getPid()+" "+person1.getName()+" "+person1.getAddress()+" "+person1.getContact());
	}

}
