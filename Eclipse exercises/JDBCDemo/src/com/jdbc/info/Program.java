package com.jdbc.info;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
   public static void  main(String n[]){
	   //step1 Loading driver class into memory
	   try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 2 Connecting with database and get a Connection
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	    //Step 3 Creating  a statement
		
		Scanner sc=new Scanner(System.in);
		PreparedStatement s=c.prepareStatement("insert into java values(?,?,?)");
		//Step 4 Execute the statement
		
		System.out.println("Enter sno");
		int sno=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		
	
		
		s.setInt(1, sno);
		s.setString(2, name);
		s.setDate(3,new Date(118,11,11));
				s.executeUpdate();
		
		System.out.println("Row created created");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
