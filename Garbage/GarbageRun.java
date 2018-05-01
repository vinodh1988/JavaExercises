class GarbageRun
{
  public static void main(String n[]){
    Garbage g=new Garbage(12);
	new Garbage(13).show();
	Garbage k=new Garbage(34);
	g.show();
	k.show();
	System.gc();
	k=g;
	System.out.println("Garbage Collector test...!!!");
	
	
  }
}