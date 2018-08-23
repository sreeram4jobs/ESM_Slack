package com.nano.pro.employee;

public class ReferralForNC {

private int amount;
private int data_collected;
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
	return "ReferralForNC [amount=" + amount + ", data_collected=" + data_collected + "]";
}

}
