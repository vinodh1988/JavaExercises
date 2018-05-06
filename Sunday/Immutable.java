Class Immutable
{
  private int a;
  
  Immutable(int a){
    this.a=a;
  }
  
  public void setA(int a){
	  this.a=a;
  }
  
  public void show(){
	 System.out.println("a::"+a);
  }
  
}