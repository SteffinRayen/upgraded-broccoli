package com.login.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.login.model.LoginModel;

public class LoginDB {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/steffinDB";
	static final String USER_NAME = "root";
	static final String PASSWORD = "";
	
	public boolean validateLoginDB(LoginModel formData) {
		boolean flag = false;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {			
			Class.forName(JDBC_DRIVER);			
			con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);			
			String query = "select * from users where uname='"+formData.getUname()+"' and pass='"+formData.getPass()+"'";			
			st = con.createStatement();
			rs = st.executeQuery(query);			
			System.out.println("Query");
			if (rs.next()) {
				System.out.println("Success");
				flag = true;
			} else {
				System.out.println("No hit in DB");
			}
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		finally {
			//finally block used to close resources
		      try{
		         if(st!=null)
		            con.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		}
		System.out.println("EOF");
		
		return flag;
	}
	
}
