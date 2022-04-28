package project01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project01.dao.registerdao;
import project01.entity.user;

@WebServlet("/register")
public class register extends HttpServlet {

	user u;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			registerdao t=new registerdao();
			user u = new user();
			String id = request.getParameter("uid");
			String name = request.getParameter("uname");
			String password = request.getParameter("upass");
			String role = request.getParameter("urole");
			

			u.setId(id);
			u.setName(name);
			u.setPassword(password);
			u.setRole(role);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			//out.println("<html><head></head><body> Hii</body></html>");
			
			if(t.test2(u)>0) {
				//http://localhost:8080/project01/registrationsuccess.jsp
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/registrationsuccess.jsp");
				rd.forward(request, response);
			}else {
				//out.println("<html><head></head><body>sorry can not register!!</body></html>");
				request.setAttribute("res", false);
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/register.jsp");
				rd.include(request, response);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
