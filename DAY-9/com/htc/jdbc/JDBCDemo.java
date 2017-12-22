package com.htc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement stmt=null;
		try{
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt("empID"));
				System.out.println(rs.getString("empName"));
				System.out.println(rs.getString("designation"));
				System.out.println(rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
