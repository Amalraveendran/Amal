package com.cakehub;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


@WebServlet("/Orders")
public class Orders extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String nos=request.getParameter("nos");
		String message=request.getParameter("message");
		
		
		
		
		
		
		 try
			{int i=1;
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeorders", "root", "root");
				java.sql.PreparedStatement st=con.prepareStatement("insert into orders value(?,?,?,?,?,?,?)");
				st.setString(1, name);
				st.setString(2, email);
				st.setString(3, phone);
				st.setString(4, date);
				st.setString(5, time);
				st.setString(6, nos);
				st.setString(7, message);
				//st.setString(7, name);
				st.executeUpdate();
				HttpSession session =request.getSession();
				ResultSet rs=st.executeQuery("select * from orders");
				while (rs.next())
				{	rs.absolute(i);
					session.setAttribute("name",rs.getString(1));
					session.setAttribute("email",rs.getString(2));
					session.setAttribute("phone",rs.getString(3));
					session.setAttribute("date",rs.getString(4));
					session.setAttribute("time",rs.getString(5));
					session.setAttribute("nos",rs.getString(6));
					session.setAttribute("message",rs.getString(7));
					
					i++;
				
				}
				response.sendRedirect("index.html");
				
				
				
				con.close();
				
				
				
				
				
				
			}
			catch(Exception e){
				System.out.println("E:"+e.getMessage());
				
			}
	}

	
}
 