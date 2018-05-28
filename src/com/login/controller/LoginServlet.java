package com.login.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.LoginModel;
import com.login.view.LoginDB;


/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		LoginModel formData = new LoginModel(request.getParameter("uname"),request.getParameter("pass"));
		
		System.out.println("Calling");
		LoginDB validateData = new LoginDB();
		if (validateData.validateLoginDB(formData)) {
			response.getWriter().append("Login Successfull");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} else {
			response.getWriter().append("Login Failed");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	
		System.out.println("Done");
		
	}

}
