import java.util.*;
import java.io.*;
class StringDemo{
  public static void main(String n[]) throws Exception
  {
    String r=new String("Rahul");
	String m=new String("Rahul");
	String k="Rahul";
	String l="Rahul";
	
	System.out.println(r==m);
	System.out.println(k==m);
	System.out.println(k==l);
	System.out.println(m=="Rahul");
	System.out.println("-----------------------------");
	
	System.out.println(r.equals(m));
	System.out.println(m.equals(k));
	System.out.println(k.equals(l));
	
	Integer a=10;
	Integer b=10;
	Integer c=new Integer(10);
	int x=20;
	System.out.println(b==c);

	 Integer d=Integer.parseInt(c.toString());
	 String o=String.valueOf(x);
	 
	 System.out.println("Now"+(d==c));

	System.out.println("----------------------------");
	System.out.println(c==10);
	
	
  }
}