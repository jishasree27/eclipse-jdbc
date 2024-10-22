package org.crud.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	public static Connection MyConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql//localhost:3306/EmployeeDetails","root","password");
		return conn;
	}
	
	public static  void Insert(Employee emp) throws ClassNotFoundException, SQLException 
	{
		  Connection con=Database.MyConnection();
			PreparedStatement ps=con.prepareStatement("insert into Employee(id,name,age,email,address)values(?,?,?,?,?)");
			ps.setString(1,emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAge());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getAddress());
			System.out.println(ps.executeUpdate());		
	}
	
}
