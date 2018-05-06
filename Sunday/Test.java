class Test{
    int a;
	Test(){
		System.out.println("Constructor....!!!");
	}
	public static void method(){
		System.out.println("Method is executing");
	}
	public void display(){
		System.out.println("display method");
	}
	
	{
	  //local block
      System.out.println("This is local block...!!!");	  
	}
	static
	{
		System.out.println("This is static block");
	}
	
}

class Demo
{
	public static void main(String n[]){
		Test.method();
		Test.method();
		new Test().display();
		new Test().display();
	}
}