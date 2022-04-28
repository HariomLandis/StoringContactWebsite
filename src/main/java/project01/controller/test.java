package project01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Loading the Driver
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project1", "root", "root");  
            
            if (con != null) {
                out.println("Connected to the database!");
            } else {
                out.println("Failed to make connection!");
            }
        }
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }catch(Exception e) {
        	out.println(e);
        }
	}

}
