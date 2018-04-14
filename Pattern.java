import java.util.Scanner;
public class Pattern {
	public static void main(String str[]){
		//System.out.println("Command Args: "+str[0]);
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter Any Number: ");
		int no = sc.nextInt();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=no-1;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j);	
			}
			System.out.println();
		}
	}
}