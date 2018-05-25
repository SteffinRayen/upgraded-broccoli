package com.search.model;

public class SearchModel {
	private String fname;
	private String lname;
	private String uname;
	private String pass;
	private String email;
	private String num;
	public SearchModel(String fname, String lname, String uname, String pass, String email, String num) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.num = num;
	}
	public SearchModel() {
		// TODO Auto-generated constructor stub
		super();
		this.fname = null;
		this.lname = null;
		this.uname = null;
		this.pass = null;
		this.email = null;
		this.num = null;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
}
