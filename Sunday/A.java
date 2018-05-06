interface A{
   class Temp{
    public void show(){
	  System.out.println("This is used only by methods of this interface");
	}
  }
  public void perform();
}


class Definition implements  A{
	public void perform(){
		Temp p=new Temp();
		p.show();
	}
	public static void main(String n[])
	{
		new Definition().perform();
	}
	
}