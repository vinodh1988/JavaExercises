import java.util.*;
class ExceptionTester{
  public static void main(String n[]){
	  try{
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of Records::");
	  int size=sc.nextInt();
	  if(size>500)
		  throw new RecordException();
	  System.out.println("Fetched "+size+ " Records ");
	  }
	  catch(RecordException e)
	  {
		  System.out.println(e);
		  e.printStackTrace();
	  }
  
  }
}