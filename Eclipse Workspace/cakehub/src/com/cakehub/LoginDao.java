package com.cakehub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class LoginDao {
	String sql="select * from deliverypartner where uname=? pwd=? ";
	public boolean check(String d_uname,String pwd)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeorders", "root", "root");
			java.sql.PreparedStatement st=con.prepareStatement(sql);
			st.setString(3, pwd);
			
			st.setString(6, d_uname);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Message"+e.getMessage());
		}
		
		
	return false;
	}
	
	
}
