package com.nano.pro.LoginForm;

public class LoginPage {
	private String username;
	private String password;
	private String designation;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "LoginPage [username=" + username + ", password=" + password + ", designation=" + designation + "]";
	}
	
}
