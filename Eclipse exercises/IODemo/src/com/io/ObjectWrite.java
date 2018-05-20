package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {

	public static void main(String n[]) {
		// TODO Auto-generated constructor stub
		FileOutputStream f1=null;
		//ObjectOutputStream o1=null;
		
		File f=new File("ObjectRepos");
		try {
			f1=new FileOutputStream(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(ObjectOutputStream o1=new ObjectOutputStream(f1)){
		
	    o1.writeObject(new Employee(1,"Raj","Chennai",19));
	    o1.writeObject(new Employee(2,"Naveen","Hyderabad",90));
	    o1.writeObject(new Employee(3,"Chris","Bangalore",34));
	    System.out.println("Write complete");
		}
		catch ( IOException | ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
