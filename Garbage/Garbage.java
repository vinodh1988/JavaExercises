class Garbage
{
  private int a;
  
  Garbage(int a)
  {
    this.a=a;
  }
  
  public void show()
  {
    System.out.println("a::"+a);
	System.out.println("hashCode::"+hashCode());
	System.out.println("--------------------------------");
  }
  
  protected void finalize(){
    System.out.println(hashCode()+" object is destroyed...!!");
  }
}