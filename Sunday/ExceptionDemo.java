class ExceptionDemo
{
	
	public static void classLoader(String name) throws ClassNotFoundException{
	    try{
			Class.forName(name);// throw new ClassNotFoundException()
			System.out.println("Class loaded...!");
		}
		
	    catch(Exception e)
		{
			System.out.println("Some Exception happened...!!!");
			throw e;
		}
	}
	public static void main(String n[]){
		try{
			//System.out.println(n[3]);
		    classLoader("Final7");
			main(n.length);
		}
		catch(NullPointerException e)
		{
		  e.printStackTrace();
		  System.out.println("Handled by main...!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 System.out.println("Handled by main...!");
		}
		finally{
			System.out.println("This part executes always");
		}
		
	}
	public static void main(int n){
		System.out.println("n value is "+n);
	}
}