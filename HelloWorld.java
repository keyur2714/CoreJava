//Object is nothing but instance of a class
class HelloWorld{
	//Instance Method
	//Instance Method called only by object
	void sayHello(){
		System.out.println("Hello...!");
	}
	
	//Static Method -- you can say it's Class Method or Shared Method
	static void sayBye(){
		System.out.println("Good Bye...!");
	}
	
	public static void main(String str[]){
		System.out.println("Hello Radhe Krishna...");
		HelloWorld helloWorld = new HelloWorld(); //Create Object
		helloWorld.sayHello();
		
		HelloWorld.sayBye();
	}
}