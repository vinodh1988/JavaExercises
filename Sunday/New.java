class New
{
   public static void main(String n[])
   {
     System.out.println(n.length);
	 
	 System.out.println("Crossed line number one...");
	 try{
	  Class.forName("Local34");
      System.out.println(n[0]);
	 }
	 catch(NullPointerException e){
		System.out.println("Null pointer Exception"); 
	 }
	 catch(ArithmeticException e){
		 System.out.println("Arithmetic Exception");
	 }
	 catch(ClassNotFoundException e){
		 
	 }
	 catch(Exception e){
		 
	 }
	  System.out.println("Crossed line number four..");
   }
}