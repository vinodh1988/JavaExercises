

class ShapeDemo{
	
	public static void main(String n[])
	{
		Shape ref=new Rectangle(34,21);
		ref.display();
		ref.area();
		ref.perimeter();
		
		System.out.println("-------------------------");
		
		ref=new Square(16);
		ref.display();
		ref.area();
		ref.perimeter();
		
		System.out.println("-------------------------");
		
		ref=new Traingle(16,8);
		ref.display();
		ref.area();
		ref.perimeter();
		
		//ref=new Square(17);
		//ref1.display
		
		
	}
}