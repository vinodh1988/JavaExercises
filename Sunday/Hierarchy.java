interface X{
  public void show();
}

class A {
	public void show(){
		System.out.println("A's version");
	}
}

class B extends A implements X{
	public void random(){
		System.out.println("B's version of random");
	}
}

class D{
	public static void main(String n[])
	{
		X obj=new B();
		obj.show();
	}
}