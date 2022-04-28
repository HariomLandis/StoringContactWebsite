package project01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project01.entity.user;

public class registerdao {
	public int test2(user u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");  // Loading the Driver
	    Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/project1", "root", "root"); 
	   PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");
	    ps.setString(1, u.getId());
	    ps.setString(2, u.getPassword());
	    ps.setString(3, u.getName());
	    ps.setString(4, u.getRole());
	    ps.setString(5, "waiting");
	   return ps.executeUpdate();
	}
	/*public static void main(String args[]) throws SQLException, ClassNotFoundException {
		user u=new user();
		u.setId(1);
		u.setName("hariom");
		u.setPassword("dhfds");
		u.setRole("engineer");
		test1 cd=new test1();
		cd.test2(u);
	}*/
}
