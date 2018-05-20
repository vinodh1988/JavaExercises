package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageRead {
  public static void main(String n[]){
	  File f=new File("d:\\CSS3.png");
	  File g=new File("d:\\CSS3Copy.png");
	  
	   System.out.println( f.length());
	   byte b[]=new byte[(int)f.length()];
	  FileInputStream f1=null;
	  FileOutputStream f2=null;
	  try {
		f1=new FileInputStream(f);
		f2=new FileOutputStream(g);
		f1.read(b);
		f2.write(b);
		System.out.println("Please check disk");
		
		System.out.println();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  finally{
		  try {
			f2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
  }
}
