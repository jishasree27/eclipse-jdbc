package net.crud.usermanagement.dao.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.crud.usermanagement.model.User;

public class UserDAO {
	   
	private String jdbcURL="jdbc://mysql://localhost:3306/usermanagement?useSSL=false";
	private String jdbcUsername="root";
	private String jdbcPassword="password";
	
	
	
	private static final String INSERT_USER_SQL ="INSERT INTO users" +" (name,email,country)VALUES" +"(?,?,?);";
	private static final String SELECT_USER_BY_ID="select id,name,email,country from users id= ?";
	private static final String SELECT_ALL_USERS="select * from users";
	private static final String DELETE_USERS_SQL="delete from users where id = ?;";
	private static final String UPDATE_USERS_SQL="update users set name =?,email= ?,country =?;";
	
protected Connection getConnection() {
	Connection conn= null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	return conn;
	
}
//insert user
public void insertUser(User user) throws SQLException {
	try(Connection conn =getConnection();
			PreparedStatement preparedStatement =conn.prepareStatement(INSERT_USER_SQL)){
		    preparedStatement.setString(1, user.getName());
		    preparedStatement.setString(2, user.getEmail());
		    preparedStatement.setString(3,user.getCountry());
		    preparedStatement.executeUpdate();
		    
	}catch(Exception e) {
		e.printStackTrace();
	}
}
//update user
public boolean updateUser(User user) throws SQLException {
	boolean rowUpdated;
	try(Connection conn =getConnection();
			PreparedStatement statement =conn.prepareStatement(UPDATE_USERS_SQL);){
		   statement.setString(1, user.getName());
		   statement.setString(2, user.getEmail());
		   statement.setString(3,user.getCountry());
		   statement.setInt(4,user.getId());
		    rowUpdated=statement.executeUpdate()>0;
	}
	return rowUpdated;
	}
//select user by id
public User selectUser(int id) {
	User user=null;
	try(Connection conn=getConnection();
			PreparedStatement preparedStatement =conn.prepareStatement(SELECT_USER_BY_ID);){
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs=preparedStatement.executeQuery();
			
while(rs.next()) {
	String name=rs.getString("name");
	String email=rs.getString("email");
	String country=rs.getString("country");
	user=new User(id, name,email,country);
}
	
}catch (SQLException e) {
	e.printStackTrace();
}
	return user;
}

//select user
public List<User> selectAllUser(int id) {
	List<User> users =new ArrayList<>();
	try(Connection conn=getConnection();
			PreparedStatement preparedStatement =conn.prepareStatement(SELECT_USER_BY_ID);){
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs=preparedStatement.executeQuery();
			
while(rs.next()) {
	int id1  =rs.getInt("id");
	String name=rs.getString("name");
	String email=rs.getString("email");
	String country=rs.getString("country");
	users.add(new User(id1,name,email,country));
}
	
}catch (SQLException e) {
	e.printStackTrace();
}
	return users;
}
//delete users

	public boolean deleteUser(int id)throws SQLException{
		boolean rowDeleted;
		try(Connection conn=getConnection();
				PreparedStatement statement =conn.prepareStatement(DELETE_USERS_SQL);){	
				statement.setInt(1, id);
				rowDeleted=statement.executeUpdate()>0;
	}
		return rowDeleted;
}
}



