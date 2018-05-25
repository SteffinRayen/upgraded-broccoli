package com.register.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.model.RegisterModel;
import com.register.view.RegisterDB;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		RegisterModel formData = new RegisterModel
				(request.getParameter("fname"),request.getParameter("lname"),request.getParameter("uname")
						,request.getParameter("pass"),request.getParameter("email"),request.getParameter("num"));
		
		System.out.println("Calling");
		RegisterDB validateData = new RegisterDB();
		if (validateData.validateRegisterDB(formData)) {
			response.getWriter().append("Registered Successfull");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			response.getWriter().append("Registeration Failed");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	
		System.out.println("Done");
		
	}

}
