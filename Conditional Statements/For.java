class For{
	public static void main(String n[])
	{
		outer:
		for(int i=1;i<=5;i++){
			System.out.println(i+" table ");
			System.out.println("______________________________");
			inner:
			for(int j=1;j<=10;j++)
			{
				if(i==3 && j==5)
					break outer;
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			
			System.out.println("___________________________");
		}
	}
}