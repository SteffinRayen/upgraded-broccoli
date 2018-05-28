package com.search.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.search.model.SearchModel;
import com.search.view.SearchDB;

/**
 * Servlet implementation class SearchServlet
 */
//@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SearchModel formData = new SearchModel(null,null,request.getParameter("uname"),null,null,null);
		
		System.out.println("Calling");
		SearchDB obj = new SearchDB();
		
		List<SearchModel> dataList= new ArrayList<SearchModel>();
		try {
			dataList = obj.searchDB(formData);
			System.out.println("Came Back");
			response.getWriter().append("<table>");
			Iterator<SearchModel> iter = dataList.iterator();
			while (iter.hasNext()) {
				response.getWriter().append("<tr>");
				response.getWriter().append("<td>"+iter.next().getFname()+"</td>");
				response.getWriter().append("<td>"+iter.next().getLname()+"</td>");
				response.getWriter().append("<td>"+iter.next().getUname()+"</td>");
				response.getWriter().append("<td>"+iter.next().getPass()+"</td>");
				response.getWriter().append("<td>"+iter.next().getEmail()+"</td>");
				response.getWriter().append("<td>"+iter.next().getNum()+"</td>");
				response.getWriter().append("</tr>");
				
				//response.getWriter().append("<tr><td>" + (String)(iter.next()) + "</td></tr>");
			}
			response.getWriter().append("</table>");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Done");
	}

}
