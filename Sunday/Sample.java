interface Sample{
  public void doThis();
}

class Caller
{
	public void callThis(Sample p)
	{
		p.doThis();
	}
	
}

class Main{
	public static void main(String n[])
	{
		Caller c=new Caller();
		c.callThis(new Sample(){
			public void doThis(){
				System.out.println("AdHoc Definition");
			}
		});
		
		Sample t=()->{System.out.println("Lambda Version");};
		
		
		c.callThis(t);
	}
}