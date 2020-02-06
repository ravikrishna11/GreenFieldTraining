package com.connectvity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValues {

	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter employee Id: ");
		int eid= sc.nextInt();
		
		System.out.println("Enter employee Name: ");
		String ename= sc.next();
		
		System.out.println("Enter employee Adress: ");
		String eaddress= sc.next();
		
		String jdbc_url= "jdbc:mysql://localhost:3306/ravi";
		String user= "root";
		String pwd= "Satya";
		String mysql_query= String.format("insert into emp_table values(%d,'%s','%s')",eid,ename,eaddress);
        
		 Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(jdbc_url, user, pwd);
		Statement st= con.createStatement();
		st.executeUpdate(mysql_query);
		System.out.println("Values inserted sucessfully");
		con.close();

	}

}
