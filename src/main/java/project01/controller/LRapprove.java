package project01.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project01.entity.dbcon;

/**
 * Servlet implementation class LRapprove
 */
@WebServlet("/LRapprove")
public class LRapprove extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con=dbcon.getCon();
			String s=request.getParameter("nuid");
			PreparedStatement ps=con.prepareStatement("update user set r_status='Accepted' where id=?");
			ps.setString(1, s);
			ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("Adminview.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
