package com.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class NumFormat {
  public static void main(String arg[]){
	double d=12000.34;
	Locale l=new Locale("ta","IN");
	Date d1=new Date();
	
	NumberFormat n=NumberFormat.getCurrencyInstance(l);
	System.out.println("Price::"+ n.format(d));
	
	DateFormat d2=DateFormat.getDateInstance(DateFormat.LONG,l);
	System.out.println(d2.format(d1));
  }
}
