
		class Student{
			private int rollNo; // DataMembers are Always Private to achieve Encapsulation
			private String name;
			private String course;
			private long fees;
			
			public void setRollNo(int rollNo){
				this.rollNo = rollNo; //this means current/calling object
			}	
			public int getRollNo(){
				return rollNo;
			}
			
			public void setName(String name){
				this.name = name;
			}
			public String getName(){
				return name;
			}
			
			public void setCourse(String course){
				this.course = course;	
			}
			
			public String getCourse(){
				return course;
			}
			
			public void setFees(long fees){
				this.fees = fees;
			}
			
			public long getFees(){
				return fees;
			}
			
		}
	
		public class ManageStudents {
			public static void main(String str[]){
				System.out.println("===========:Manage Students:===========");
				
				
				Student s2=new Student();
				//s2.rollNo = 10;  Not Allowed because of Private
				s2.setRollNo(27);
				s2.setName("Keyur");
				s2.setCourse("Java");
				s2.setFees(6000l);
				
				System.out.println(s2.getRollNo()+" "+s2.getName()+" "+s2.getCourse()+" "+s2.getFees());
				
				
				Student s1=new Student();
				
				s1.setRollNo(26);
				s1.setName("denish");
				s1.setCourse("Angular");
				s1.setFees(12000l);
				
				System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getCourse()+" "+s1.getFees());
				//String Array for Understanding Purpose
				
				
				int noOfFriends = 3;
				String names[]=new String[noOfFriends];
				names[0]="keyur";
				names[1]="denish";
				names[2]="vinit";
				
				for(int i=0;i<names.length;i++){
					System.out.println(names[i]);	
				}
				
				int noOfStudents = 3;
				Student s[]=new Student[noOfStudents]; //Declaration of Array 
				for(int i=0;i<s.length;i++){
					s[i]=new Student(); //Actual Memmory allocated here
					s[i].setRollNo(i+1);
					s[i].setName("Name: "+(i+1));
					s[i].setCourse("Course: "+(i+1));
					s[i].setFees(12000+(i+1));
				}
				for(int i=0;i<s.length;i++){
					System.out.println(s[i].getRollNo()+" : "+s[i].getName()+" : "+s[i].getCourse()+" : "+s[i].getFees());				
				}
			}
		}