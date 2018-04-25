/*
   Primitive Types (Numbers, characters and boolean)

   Integers-
   
   byte
   short
   int
   long
   
   Decimal -
   
   float
   double
   
   char -
   
   char
   
   boolean


*/
/*
  for compatable types int(4),short(2),byte(1) and long(8)
  A bigger type is never assignable to smaller type
    int a=20;
	short b=a;//error
  A Smaller type is always assigable to a bigger type
    byte a=20;
	int x=a;//no error
	
  123, 12.2, true ,'c',"Ram" all these are called literals...
  
  any integer literal in java by default is assumed as int datatype
  
  12--(int)
  
  any floating point number is by default assumed as double.
  
  12.2 is assumed as double
  
*/
import java.util.Date;
class DataTypes{
	
   public static void main(String n[])
   {
     // int b=12;
	 // byte a=(byte)b; //typecasting
	 // System.out.println("a:"+a);
	 
     // float c=123.23f;
	 // double d=47973.808;
	 
	 //int b=0x12; //Any number with leading 0x is treat Hexadecimal number
	                //    16x1+ 2 * 1=18
	 // char c='%';
	 
	 // boolean b=false;
	 //System.out.println(b);
	 //System.out.println(d);
	 //String d="Kiran";
	 
	 Date d1=new Date();
	 System.out.println(d1);
   }
}