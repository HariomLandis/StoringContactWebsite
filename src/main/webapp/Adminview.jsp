<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.sql.*,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

<%
	  Connection Con = null;
	 response.setContentType("text/html");
	 
	  PrintWriter out1 = response.getWriter();
	try 
	{  
		//Con = DriverManager.getConnection( url, dbuser, dbuserpw);
		Con = project01.entity.dbcon.getCon();
		String  q      = "select * from user";
		PreparedStatement   Pstobj  = Con.prepareStatement(q);
		ResultSet RS =  Pstobj.executeQuery();
		out1.println("<table width='60%' border='2'>");
		out1.println("<tr> <th>user ID  </th><th>User Name </th>");
		out1.println("<th>User Role </th> <th>User Password </th><th> Registration Status</th></tr>");
		
		
		List<String> UIDs = new ArrayList<>();
		while (RS.next())
		{ 
			out1.println("<tr> <td> " + RS.getString(1)  ); //uid
			out1.println(" <td> " + RS.getString(3)); //userName			
			out1.println(" <td> " + RS.getString(4));  //role
			out1.println(" <td> " + RS.getString(2)); //pwd
			out1.println(" <td> " + RS.getString(5)); //status
			if ( RS.getString(5).equals("waiting")) 
				UIDs.add(RS.getString(1));				
			out1.println("</tr>"); 
		}
		out1.println("</table>"); 
				
		if(UIDs.size()!=0)
		{
		out1.println("The List of User Ids who is waiting for approval");
				
		out1.println("<form method='get' action='LRapprove'>");		
		out1.println("<Select name='nuid'>");
		for(String id : UIDs)
			out1.println("<option value=" + id + ">" + id + " </option>");
		out1.println("</Select>");
		out1.println("<input type='submit' value='Approve'/>"); 
		out1.println("</form>");
		}
		
	}
	catch(Exception e)
	{
		out1.println(e);
	}
	%>
<br/><br/>
<h4><a href="Aindex.jsp">Go Back</a></h4>
</body>
</html>