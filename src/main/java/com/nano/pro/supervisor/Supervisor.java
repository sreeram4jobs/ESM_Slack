package com.nano.pro.supervisor;


public class Supervisor {
private int supervisorid;
private String supervisorName;
private String supervisorEmail;
private String supervisorPassword;

private String supervisorPinNumber;

private String supervisor3DigitCode;

private int supervisorNumber;

private String supervisorBankAccount;
private String supervisorField;

private String supervisorDateOfIssue;
private String supervisorNonRefundbleDeposite;
private String supervisorTemparary_Perminent;
private String supervisorAaDharCardNumber;	


public int getSupervisorid() {
	return supervisorid;
}
public void setSupervisorid(int supervisorid) {
	this.supervisorid = supervisorid;
}
public String getSupervisorName() {
	return supervisorName;
}
public void setSupervisorName(String supervisorName) {
	this.supervisorName = supervisorName;
}
public String getSupervisorEmail() {
	return supervisorEmail;
}
public void setSupervisorEmail(String supervisorEmail) {
	this.supervisorEmail = supervisorEmail;
}
public String getSupervisorPassword() {
	return supervisorPassword;
}
public void setSupervisorPassword(String supervisorPassword) {
	this.supervisorPassword = supervisorPassword;
}
public String getSupervisorDateOfIssue() {
	return supervisorDateOfIssue;
}
public void setSupervisorDateOfIssue(String supervisorDateOfIssue) {
	this.supervisorDateOfIssue = supervisorDateOfIssue;
}
public String getSupervisorPinNumber() {
	return supervisorPinNumber;
}
public void setSupervisorPinNumber(String supervisorPinNumber) {
	this.supervisorPinNumber = supervisorPinNumber;
}
public String getSupervisorNonRefundbleDeposite() {
	return supervisorNonRefundbleDeposite;
}
public void setSupervisorNonRefundbleDeposite(String supervisorNonRefundbleDeposite) {
	this.supervisorNonRefundbleDeposite = supervisorNonRefundbleDeposite;
}
public String getSupervisor3DigitCode() {
	return supervisor3DigitCode;
}
public void setSupervisor3DigitCode(String supervisor3DigitCode) {
	this.supervisor3DigitCode = supervisor3DigitCode;
}
public String getSupervisorTemparary_Perminent() {
	return supervisorTemparary_Perminent;
}
public void setSupervisorTemparary_Perminent(String supervisorTemparary_Perminent) {
	this.supervisorTemparary_Perminent = supervisorTemparary_Perminent;
}

public String getSupervisorAaDharCardNumber() {
	return supervisorAaDharCardNumber;
}
public int getSupervisorNumber() {
	return supervisorNumber;
}
public void setSupervisorNumber(int supervisorNumber) {
	this.supervisorNumber = supervisorNumber;
}

public void setSupervisorAaDharCardNumber(String supervisorAaDharCardNumber) {
	this.supervisorAaDharCardNumber = supervisorAaDharCardNumber;
}
public String getSupervisorBankAccount() {
	return supervisorBankAccount;
}
public void setSupervisorBankAccount(String supervisorBankAccount) {
	this.supervisorBankAccount = supervisorBankAccount;
}
public String getSupervisorField() {
	return supervisorField;
}
public void setSupervisorField(String supervisorField) {
	this.supervisorField = supervisorField;
}
@Override
public String toString() {
	return "Supervisor [supervisorid=" + supervisorid + ", supervisorName=" + supervisorName + ", supervisorEmail="
			+ supervisorEmail + ", supervisorPassword=" + supervisorPassword + ", supervisorDateOfIssue="
			+ supervisorDateOfIssue + ", supervisorPinNumber=" + supervisorPinNumber
			+ ", supervisorNonRefundbleDeposite=" + supervisorNonRefundbleDeposite + ", supervisor3DigitCode="
			+ supervisor3DigitCode + ", supervisorTemparary_Perminent=" + supervisorTemparary_Perminent
			+ ", supervisorNumber=" + supervisorNumber + ", supervisorAaDharCardNumber=" + supervisorAaDharCardNumber
			+ ", supervisorBankAccount=" + supervisorBankAccount + ", supervisorField=" + supervisorField + "]";
}

	
}
