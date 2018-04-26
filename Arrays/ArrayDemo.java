class ArrayDemo
{
	public static void main(String na[])
	{
		/*short b=5987;
		short d=897;
		int k[]={1,2,3,4,5};
		int a[]=new int[10];
		String p[]=new String[10];
		a[1]=18;
		a[2]=90;
		a[6]=b;
		a[8]=d;
		/*for(int i=0;i<a.length;i++)
	System.out.println("a["+i+"]= "+a[i]);*/

      /*for(int temp:k)
		   System.out.println(temp);*/
	   
	   int n[][]=new int[3][]; //Variable sized array
	   
	   n[0]=new int[3];
	   n[0][0]=12;
	   n[0][1]=89;
	   n[0][2]=100;
	   n[1]=new int[1];
	   n[1][0]=900;
	   n[2]=new int[2];
	   
	   for(int x=0;x<n.length;x++)
	   {
		   for(int y=0;y<n[x].length;y++)
		   {
			   System.out.print(n[x][y]+" ");
		   }
		
		System.out.println();
	   }
		//int a[15];//error
	}
}