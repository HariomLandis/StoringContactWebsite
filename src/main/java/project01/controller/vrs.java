package project01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vrs
 */
@WebServlet("/vrs")
public class vrs extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("vid");
		String p=request.getParameter("ps");
		try {
			Connection con=project01.entity.dbcon.getCon();
			PreparedStatement ps=con.prepareStatement("select * from user where id=? and password=?");
			ps.setString(1, s);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			if(rs.next()) {
				out.println("<table width='60%' border='2'");
				out.println("<tr><th>User Id</th><th>name</th>");
				out.println("<th>role</th><th>status</th></tr>");
				out.println("<tr><td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td></tr>");
				out.println("</table>");
				out.println("<h3><a href='index.jsp'>Go Back</a></h3>");
			}
			else {
				out.println("sorry no record with this attributes");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
