package com.search.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.search.model.SearchModel;

public class SearchDB {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/steffinDB";
	static final String USER_NAME = "root";
	static final String PASSWORD = "";
		
	public ArrayList<SearchModel> searchDB(SearchModel formData) throws ClassNotFoundException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<SearchModel> tableData = new ArrayList<SearchModel>(4);
		
		try {			
			Class.forName(JDBC_DRIVER);			
			con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);			
			String query = "select * from users where uname='"+formData.getUname()+"'";
			System.out.println(query);
			st = con.createStatement();
			rs = st.executeQuery(query);			
			System.out.println("Query");
			while (rs.next()) {
				// Storing array List
				
				SearchModel tempData = new SearchModel(rs.getString("fname"),rs.getString("lname"),rs.getString("uname"),"***",rs.getString("email"),rs.getString("number"));
				tableData.add(tempData);				
				
			}
			return tableData;
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
		return null;
		
	}

}
