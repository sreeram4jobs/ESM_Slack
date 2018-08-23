package com.nano.pro.employee;

public class Vendor_details {
private int id;
private String  user_name;
private String landline;
private int whatsapp;
private int yrsofexp;
private String socialmedia;
private String education;
private String experience;
private String awards	;
private String achievements;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getLandline() {
	return landline;
}
public void setLandline(String landline) {
	this.landline = landline;
}
public int getWhatsapp() {
	return whatsapp;
}
public void setWhatsapp(int whatsapp) {
	this.whatsapp = whatsapp;
}
public int getYrsofexp() {
	return yrsofexp;
}
public void setYrsofexp(int yrsofexp) {
	this.yrsofexp = yrsofexp;
}
public String getSocialmedia() {
	return socialmedia;
}
public void setSocialmedia(String socialmedia) {
	this.socialmedia = socialmedia;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public String getAwards() {
	return awards;
}
public void setAwards(String awards) {
	this.awards = awards;
}
public String getAchievements() {
	return achievements;
}
public void setAchievements(String achievements) {
	this.achievements = achievements;
}
@Override
public String toString() {
	return "Vendor_details [id=" + id + ", user_name=" + user_name + ", landline=" + landline + ", whatsapp=" + whatsapp
			+ ", yrsofexp=" + yrsofexp + ", socialmedia=" + socialmedia + ", education=" + education + ", experience="
			+ experience + ", awards=" + awards + ", achievements=" + achievements + "]";
}




}
