package com.nano.pro.employee;

import java.util.Date;

public class ReferralMechanism {

private int rid;
private String referralCode;
private String emailId;
private String category;
private Date  ReferralMechanismDate;
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public String getReferralCode() {
	return referralCode;
}
public void setReferralCode(String referralCode) {
	this.referralCode = referralCode;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Date getReferralMechanismDate() {
	return ReferralMechanismDate;
}
public void setReferralMechanismDate(Date referralMechanismDate) {
	ReferralMechanismDate = referralMechanismDate;
}
@Override
public String toString() {
	return "ReferralMechanism [rid=" + rid + ", referralCode=" + referralCode + ", emailId=" + emailId + ", category="
			+ category + ", ReferralMechanismDate=" + ReferralMechanismDate + "]";
}	
	
}
