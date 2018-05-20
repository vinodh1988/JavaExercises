package com.test;

import java.lang.reflect.Method;

public class Reflection {
    public static void main(String n[]){
    	Class c=DataClass.class;
    	Method m[]=c.getMethods();
    	
    	for(Method x:m){
    		System.out.println(x.getName());
    	}
    	
    	try {
			DataClass d =(DataClass)c.newInstance();
			d.method1();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @Override
    public String toString(){
    	return "Hello";
    }
}