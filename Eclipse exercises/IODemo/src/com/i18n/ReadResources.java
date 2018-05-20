package com.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ReadResources {
   public static void main(String n[]){
	   Locale l=Locale.ENGLISH;
	   Locale l1=new Locale("fr","FR");
	   Locale l2=new Locale("hi","IN");
	   Locale l3=new Locale("ta","IN");
	   Locale current=null;
	   
	   Scanner s=new Scanner(System.in);
	   System.out.println("Language 1.English 2.Hindi 3.Tamil 4.French");
	   System.out.println("Enter your language choice");
	   int lang=Integer.parseInt(s.next());
	   
	   switch(lang){
	   case 1:
		   current=l;
	       break;
	   case 2:
		   current=l2;
	       break;
	   case 3:
		   current=l3;
	       break;
	   case 4:
		   current=l1;
	       break;
	    default:
	    	current=l;
	   }
	   
	   ResourceBundle r=ResourceBundle.getBundle("resource",current);
	   
	   System.out.println(r.getString("message"));
	   
	   String p=s.next();
	   System.out.println(p);
   }
}
