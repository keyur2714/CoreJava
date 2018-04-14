import java.util.Scanner;
public class CheckPalindrom{
	
	public static String revStr(String s){
		String rev = "";
		char c;
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i)+"");
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				System.out.println((char)(int)s.charAt(i)-32);
			}
			rev = rev + s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String str[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String s=sc.next();
		
		System.out.println("Origina String is: "+s);
		String reverseString = CheckPalindrom.revStr(s);
		System.out.println("Revirse String is: "+reverseString);
		
		if(s.equals(reverseString)){
			System.out.println("String is Palindrom...!");
		}else{
			System.out.println("String is Not Palindrom...!");
		}
	}
}