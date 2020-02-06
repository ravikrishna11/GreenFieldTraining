package com.connectvity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		
		String jdbc_url= "jdbc:mysql://localhost:3306/ravi";
		String user= "root";
		String pwd= "Satya";
		String mysql_query= "create table emp_table(eid int,ename varchar(15),eaddress varchar(15))";
        
		 Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(jdbc_url, user, pwd);
		Statement st= con.createStatement();
		st.executeUpdate(mysql_query);
		System.out.println("Table created sucessfully");
		con.close();
		
		
	}

}
