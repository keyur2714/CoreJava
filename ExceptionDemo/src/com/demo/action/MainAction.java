package com.demo.action;

import java.io.IOException;

class A{
	public void displayA() throws Exception{
		String k = "keyur";
		System.out.println("A......"+k.length());
	}
}
public class MainAction extends A{
	
	@Override
	public void displayA() throws NullPointerException{
		try {
			super.displayA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello From Action Class!!");
	}
	
	public static void main(String[] str) {
		// TODO Auto-generated method stub
			System.out.println("Git Test");
			
			int no1 = 10;
			int no2 = 2;			
			int result = 0;
			
			String s = "keyur";//"keyur";
			
			try {
				System.out.println(s.toUpperCase());
				result = no1 / no2;
				System.out.println(str[0]);
			}catch (ArithmeticException | NullPointerException e) {
				if(e instanceof NullPointerException) {
					System.out.println("Null Object can not access any methods.");
				}
				if(e instanceof ArithmeticException) {
					System.out.println(e.getMessage() +" Division By 0 is not Allowed in Maths!!");	
				}												
			}catch(Exception ex) {
				System.out.println("Handle All other Exception: "+ex);
			}
//			catch(NullPointerException ex) {
//				System.out.println("Null Object can not access any methods.");
//				System.out.println(ex);
//			} 
			finally {
				System.out.println("Always Executed");
			}
			
			System.out.println("Result: "+result);
			
			MainAction m = new MainAction();
			m.displayA();
			
			System.out.println("Good Bye..");
	}

}
