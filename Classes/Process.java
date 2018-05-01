class Process
{
  public static void main(String a[])
  {
     Person obj=new Person();
	 Person obj1=new Person(12,"Raj",75,"Chennai");
	 Person obj2;
	 System.out.println(obj1);
	 
	 obj1.showPerson();
	 obj.showPerson();
  }

}

/* 

  An object is an instance of the class
  
  Hashcode -- a hexadecimal
  number which represents the 
  object
  
  
  Only Essential details
  must be allowed and background
  implementation must be hidden
  this feature is data abstraction
  
  Polymorphism --many forms
  
  one name taking many forms
  
  +-->12+34
      "Raj"+"John"
	  
  fun()
  fun(int)
  
*/