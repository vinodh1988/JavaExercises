package com.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {

	public ObjectRead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String n[]){
		File f=new File("ObjectRepos");
		FileInputStream f1=null;
		ObjectInputStream o1=null;
		try {
			f1 = new FileInputStream(f);
		    o1=new ObjectInputStream(f1);
		    while(true){
		    	Employee e=(Employee) o1.readObject();
		    	System.out.println(e);
		    	
		    }
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch(EOFException e){
			System.out.println("Done reading...");
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
