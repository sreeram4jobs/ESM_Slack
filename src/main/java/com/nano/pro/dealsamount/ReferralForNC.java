package com.nano.pro.dealsamount;

public class ReferralForNC {
private int rncid;
private String referralCode;
private int amount;
private int data_collected;
public int getRncid() {
	return rncid;
}
public void setRncid(int rncid) {
	this.rncid = rncid;
}
public String getReferralCode() {
	return referralCode;
}
public void setReferralCode(String referralCode) {
	this.referralCode = referralCode;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getData_collected() {
	return data_collected;
}
public void setData_collected(int data_collected) {
	this.data_collected = data_collected;
}
@Override
public String toString() {
	return "ReferralForNC [rncid=" + rncid + ", referralCode=" + referralCode + ", amount=" + amount
			+ ", data_collected=" + data_collected + "]";
}

}
