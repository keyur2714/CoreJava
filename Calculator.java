

class CalculatorOperation{
	int number1;
	int number2;
	
	int add(){
		return number1+number2;
	}	
		
	int substract(){
		return number1-number2;
	}		
	
	int mul(){
		return number1*number2;
	}	
	
	int div(){
		return number1/number2;
	}	
}
public class Calculator{
	public static void main(String str[]){
		int result = 0;
		String action = "";
		CalculatorOperation calOperation = new CalculatorOperation();
		if(str.length == 3){
			System.out.println(str[0]+" "+str[1]+" "+str[2]);		
			calOperation.number1 = Integer.parseInt(str[0]);
			calOperation.number2 = Integer.parseInt(str[1]);			
			action = str[2];
		}else{
			System.out.println("Invalid Arguments..");
		}
		result = calOperation.add();
		System.out.println("Result is: "+result);
		
		CalculatorOperation calOperation2 = new CalculatorOperation();
		calOperation2.number1 = 44;
		result = calOperation2.add();
		System.out.println("Result is: "+result);
		
		
		switch(action){
			case "+":
				result = calOperation.add();
				break;
			case "-":
				result = calOperation.substract();
				break;
			case "*":
				result = calOperation.mul();
				break;
			case "/":
				result = calOperation.div();
				break;	
			default:
				System.out.println("Invalid Action..");
		}
		System.out.println("Action: "+action+" Result: "+result);
	}
}