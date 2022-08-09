package com.database.mysql.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_MySql_Testing {
	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/seltesting", "root", "Pass@123");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from records where id = 1");
		
		while(rs.next()) {
			
			System.out.println(rs.getString("Full_Name"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
			
			
		}
		
		
		
		
	}
	
	
		
}
