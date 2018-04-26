/*
   Three Iterative Statements in java
    while
	do while
	for

*/

class Iteration
{
	public static void main(String n[])
	{
		int a=20;
		do
		{
			System.out.println("Runs...!!!"+a);
			if(++a ==28){
				 ++a;
				continue;
			}
			if(a==40)
				break;
			System.out.println("Running....!!!");
			
			
		}while(a<=34);
	}
}