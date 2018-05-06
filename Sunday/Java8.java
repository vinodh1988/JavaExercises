interface Java8{
 
  public static void doIt(){
     System.out.println("Do this one...!!!");
  }
  
  default public void defaultfun(){
	 System.out.println("This function is default"); 
  }
}

class Implementer implements Java8{
	
}
class JavaTest{
   public static void main(String n[]){
	   Java8.doIt();
	   Java8 f1=new Implementer();
	   f1.defaultfun();
	   //f1.doIt(); not legal
   }
   
   
}