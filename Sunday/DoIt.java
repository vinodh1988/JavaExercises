import java.util.*;

class Test{
  public  static List<String> getPlayers(){
    List<String>l=new ArrayList<String>();
	l.add("Ram");
	l.add("George");
	l.add(null);
	l.add("Nathan");
	return l;
  }
}

class Caller{
	public static void main(String n[])
	{
		List<String> c=Test.getPlayers();
		
		for(String x:c)
		{
			try{
			System.out.println(x+"  "+x.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("That position had null");
			}
			
		}
		
	}
}