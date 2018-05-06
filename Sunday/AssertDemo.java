
class AssertDemo
{
	static int a;
	static
	{
		a=42;
	}
	public static void main(String n[]){
		System.out.println("First few lines processed");
		a+=n.length;
		System.out.println("Few More lines processed");
		a++;
		System.out.println("Further some lines processed");
		a+=String.valueOf(a).length();
		assert a>=48:"Something went wrong!!!";
		System.out.println("Running still...");
		
	}
	
}