package com.util;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.io.Employee;

public class SetDemo {
  public static void main(String n[]){
	  Set l=new TreeSet();

	 l.add(new Employee(1,"Raj","Chennai",40));
	 l.add(new Employee(12,"Bajaj","Chennai",43));
	 l.add(new Employee(3,"Bevan","Jaipur",33));
	  
	  Iterator i=l.iterator();
	  
	  while(i.hasNext())
		  System.out.println(i.next());
	  
	  
  }
}
