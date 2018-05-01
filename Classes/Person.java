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
  
  Person(int sno,String name,int age,String city){
    this.sno=sno;
	this.name=name;
	this.age=age;
	this.city=city;
  }
  public void showPerson(){
	   System.out.println("sno:"+sno);
	   System.out.println("Name:"+name);
	   System.out.println("Age:"+age);
	   System.out.println("City:"+city);
   }

   public void  setPerson(String name,String city)
   {
	   this.name=name;
	   this.city=city;
	   System.out.println("Value changed");
   }
   
   public void setPerson(String name)
   {
	   this.name=name;
   }
}

/*
   this refers to current object
   
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
   
   Method overloading-(polymorphism)
   
      One name multiple methods
	  
	  Difference should be created b/w multiple copies of the same method
	  
	  between 
	  number of parameters
	  order of parameters
	  type of the parameters
	  
	  return type and access specifiers doesnot matter
	  
	  
*/