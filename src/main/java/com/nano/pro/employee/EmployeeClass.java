package com.nano.pro.employee;

public class EmployeeClass {
private int eid;
private String eName;
private String eEmail;
private String ePassword;
private String eMobile;
private String eAddress;
private String referalCode;
private String eImage;
private String eStatus;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteEmail() {
	return eEmail;
}
public void seteEmail(String eEmail) {
	this.eEmail = eEmail;
}
public String getePassword() {
	return ePassword;
}
public void setePassword(String ePassword) {
	this.ePassword = ePassword;
}
public String geteMobile() {
	return eMobile;
}
public void seteMobile(String eMobile) {
	this.eMobile = eMobile;
}
public String geteAddress() {
	return eAddress;
}
public void seteAddress(String eAddress) {
	this.eAddress = eAddress;
}
public String getReferalCode() {
	return referalCode;
}
public void setReferalCode(String referalCode) {
	this.referalCode = referalCode;
}
public String geteImage() {
	return eImage;
}
public void seteImage(String eImage) {
	this.eImage = eImage;
}
public String geteStatus() {
	return eStatus;
}
public void seteStatus(String eStatus) {
	this.eStatus = eStatus;
}
@Override
public String toString() {
	return "EmployeeClass [eid=" + eid + ", eName=" + eName + ", eEmail=" + eEmail + ", ePassword=" + ePassword
			+ ", eMobile=" + eMobile + ", eAddress=" + eAddress + ", referalCode=" + referalCode + ", eImage=" + eImage
			+ ", eStatus=" + eStatus + "]";
}

	
	
}
