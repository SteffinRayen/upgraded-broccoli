package com.login.model;

public class LoginModel {
	
	private String uname;
	private String pass;

	public LoginModel(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public LoginModel() {
		// TODO Auto-generated constructor stub
		
	}

}
