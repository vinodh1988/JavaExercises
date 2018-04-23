/*
    *According to convention, Java class names must start with upper case
	*No special charectars allowed except _
	*Names should not start with Numbers but numbers can be used in the
	  middle
	*If your class name is combination of two words, use camel case, avoid
	under score
	    
		UnderGraduate instead of Under_Graduate
		SoftwareProgrammer instead Software_Programmer

*/
/*

 Naming methods and variables
 
   -- same rules as that of naming a class only difference
   is conventionally you should start with lower case
 
 */

//First Java programming

class First
{
	public static void main(String n[]){
		System.out.println("First Java Class Running!!!!");
		System.out.println("Second line is also Executing!!!");
		displayThis(); //method calls
		Second.secondMethod();
	}
	
	static void displayThis(){
		System.out.println("Function in the method");
	} //method definition
}

class Second{
	static void secondMethod(){
		System.out.println("Method in the second class");
	}
}