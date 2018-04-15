package com.demo.action;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		System.out.println("Hello Radhe Krishna...!"+ args[0]);
		System.out.println(args.length);
		String n=System.getProperty("name");
		System.out.println(n);
		System.out.print("Enter Line: ");
		String input = new Scanner(System.in).nextLine();
		System.out.println("Input String is: "+input);
		
		String names[]=input.split(" ");
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]+" "+names[i].length());
		
		System.out.println("No Of Words are: "+names.length);
		
		
		
	}

}
