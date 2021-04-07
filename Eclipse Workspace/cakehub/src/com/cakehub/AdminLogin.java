package com.cakehub;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	String uname=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	if(uname.equals("admin")&& pwd.equals("pwd"))
	{
		HttpSession session =request.getSession();
		session.setAttribute("username",uname);
		response.sendRedirect("admin-.jsp");
		
	}
	else
	{
		response.sendRedirect("login.jsp");
	}
	
	}

	
}
