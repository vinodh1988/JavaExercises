class Child extends Parent
{
  int b;
  
  Child(){
  }
  
  Child(int b)
  {
	super(b);
    this.b=b;
  }
  
  public void show(){
	super.show();
    System.out.println("B::"+b);
  }
}

/*

Constructor overloading
method overloading

*/