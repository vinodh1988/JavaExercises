class Person
{
  private int sno;  //instance members
  private  String name;
  private  int age;
  private String city;
  
 /*constructor*/
 
  Person(){
	  sno=-1;
	  name="NoName";
	  age=-1;
	  city="UnKnown";
  }//
  
  Person(int x,String y,int z,String c){
     sno=x;
     name=y;
     age=z;
     city=c;	 
  }
  public void showPerson(){
	   System.out.println("sno:"+sno);
	   System.out.println("Name:"+name);
	   System.out.println("Age:"+age);
	   System.out.println("City:"+city);
   }

}

/*
   Constructor is a special function
   which instantiates an object and in general
   it is used for instance variables intialization
   
   It has same name as that of class
   
   It has no return type
   
   You can use any use any access specifiers
   for the constructor..

   The process of wrapping data and functionality together
   under a unit is called encapsulation
   
   there are 4 access specifiers
   in java
   
   private
   public 
   protected
   default(No keyword)
*/