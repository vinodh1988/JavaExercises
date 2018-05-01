class Stat
{
   private int a;
   private static int b;
   
   Stat(){
	   a++;
	   b++;
   }
   
   public void display(){
	   System.out.println("a::"+a);
	   System.out.println("b::"+b);//true no error
   }
   
   public static void show(){
	   //System.out.println("a::"+a); //Not allowed 
	   System.out.println("b::"+b);
   }

}

/*

A Non static member can access static member
In a static context only static member can be accessed

*/