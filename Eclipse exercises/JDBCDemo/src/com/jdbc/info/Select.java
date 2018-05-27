package com.jdbc.info;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
   public static void main(String n[]){
	   try{
		   Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step 2 Connecting with database and get a Connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		    //Step 3 Creating  a statement
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from java");
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3));
			}
			
			
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
   }
}
