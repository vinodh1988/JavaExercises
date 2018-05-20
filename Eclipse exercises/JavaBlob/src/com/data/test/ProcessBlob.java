package com.data.test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProcessBlob {
   public static void main(String n[]){
	   try{
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con = 
		    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		    File imgfile = new File("D:\\fvprices.xls");
		    FileInputStream fin = new FileInputStream(imgfile);
		    PreparedStatement pre = con.prepareStatement
		    		("insert into tabsecure values(?,?,?)");
		    pre.setInt(1, 3);
		    pre.setString(2, "It is xls file");
		    pre.setBinaryStream(3, fin, (int) imgfile.length());
		    pre.executeUpdate();
		    System.out.println("File uploaded successfully");
		    pre.close();
		    con.close();
		   
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
   }
}
