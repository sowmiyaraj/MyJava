package com.dallas.sowmiya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			 connection = DriverManager.getConnection("jdbc:derby://localhost:1527/hibernatedb");
			/* Statement statment = connection.createStatement();
			 String query = "select * from Student";
			 ResultSet rs = statment.executeQuery(query);
			 while(rs.next()){
				 System.out.println(rs.getString(1) + "::"+ rs.getInt(2));
			 }*/
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
