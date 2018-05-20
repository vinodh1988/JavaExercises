package com.util;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.io.Employee;

public class ListDemo {
  public static void main(String n[]){
	  List l=new LinkedList();
	  l.add(null);
	  l.add(null);
	  l.add(1);
	  l.add(1);
	  l.add("Raj");
	  l.add(new Employee(1,"Raj","Chennai",40));
	  System.out.println(l);
	  l.add(2,"Ganesh");
	  l.remove(3);
	  System.out.println(l);
	  
	  for(Object x:l)
		  System.out.println(x);
	  
	  for(int i=0;i<l.size();i++)
		  System.out.println(l.get(i));
	  System.out.println("----------------------------");
	  
	  ListIterator i=l.listIterator();

	  while(i.hasNext()){
		  System.out.println(i.next());
		  
		  
	  }
  }
}
