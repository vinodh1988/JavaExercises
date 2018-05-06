interface CommonPoint
{
  public void commonMethod();
}

class RandomClass  implements CommonPoint
{
   public void commonMethod(){
     System.out.println("Random Class version of Common method");
   }
   
   public void display(){
	   System.out.println("Random Display");
   }
}

class AnotherClass implements CommonPoint
{
   public void commonMethod(){
     System.out.println("Another class version of Common method");
   }
}

class Work{
	public static void main(String n[]){
	   CommonPoint c=new CommonPoint(){
		   public void commonMethod(){
		   System.out.println("ADHOC definition");
		   }};
	   
	   c.commonMethod();
	   
	   c=new AnotherClass();
	   c.commonMethod();
	}
}
