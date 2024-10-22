package org.pack.details;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	
		public static Connection getConnection() throws ClassNotFoundException, SQLException	 
		 {
			Class.forName("com.mysql.jdbc.driver");
			Connection conn=DriverManager.getConnection("jdbc.mysql//localhost:3306/general","root","password");
			return conn;
		 }
		public static void insert(Pojo pj) throws ClassNotFoundException, SQLException 
		 {
			 Connection conn=Dao.getConnection();
			 PreparedStatement ps=conn.prepareStatement("insert into generaldetail values(?,?,?)");
			 ps.setString(1, pj.getName());
			 ps.setString(2, pj.getEmail());
			 ps.setString(3, pj.getPassword());
			 ps.execute();
			 conn.close();
	}
	}
		


