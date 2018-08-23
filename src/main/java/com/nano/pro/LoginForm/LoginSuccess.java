package com.nano.pro.LoginForm;

public class LoginSuccess {

private String statuscode;
private String message;
public String getStatuscode() {
	return statuscode;
}
public void setStatuscode(String statuscode) {
	this.statuscode = statuscode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "LoginSuccess [statuscode=" + statuscode + ", message=" + message + "]";
}

	
}
