package com.nano.pro;

public class Sankar {
private int id;
private String name;
private String email;
private double rate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "Sankar [id=" + id + ", name=" + name + ", email=" + email + ", rate=" + rate + "]";
}

}
