package com.connectvity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) throws Exception {
		

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Adress: ");
		String eaddress= sc.next();
		
		String jdbc_url= "jdbc:mysql://localhost:3306/ravi";
		String user= "root";
		String pwd= "Satya";
		String mysql_query= String.format("delete from emp_table where eaddress='%s'",eaddress);
        
		 Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(jdbc_url, user, pwd);
		Statement st= con.createStatement();
		st.executeUpdate(mysql_query);
		System.out.println("Values deleted sucessfully");
		con.close();

	}


	}


