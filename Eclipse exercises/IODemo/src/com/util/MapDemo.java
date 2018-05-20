package com.util;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.io.Employee;

public class MapDemo {
    public static void main(String n[]){
    	Map<String,Employee> p=new TreeMap<String,Employee>();
        p.put("Rajesh", new Employee(1,"Raju","Chennai",48));
        p.put("Abraham",new Employee(2,"Ram","Rajuuu",24));
        p.put("Raj", new Employee(3,"Rajuu","Nagpur",34));
       // p.put(null,null);
        Set<String> s=p.keySet();
        
        for(String x:s)
        {
        	System.out.println(x);
        	System.out.println(p.get(x));
        }
        
      //  System.out.println("Accessing Data..!!!");
      //  System.out.println(p.get("Raj"));
    }
}
