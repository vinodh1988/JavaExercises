class Evaluate extends Object{
	public String toString(){
		System.out.println(super.toString());
		return "Hello!java!!!";
	}
}

class Example
{
  public static void main(String n[]){
    Evaluate e=new Evaluate();
	System.out.println(e);
	System.out.println(e.toString());
	System.out.printf("%x",e.hashCode());
	
	Object e1=new Example();
	Object f1=new Object();
	Example e2=(Example)e1;
	
	
  }
}


