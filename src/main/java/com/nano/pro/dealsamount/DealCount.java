package com.nano.pro.dealsamount;

public class DealCount {
private int did;
private String empEmailId;
private int dealAmount;
private int amount;
private int totalCollect;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getEmpEmailId() {
	return empEmailId;
}
public void setEmpEmailId(String empEmailId) {
	this.empEmailId = empEmailId.trim();
}
public int getDealAmount() {
	return dealAmount;
}
public void setDealAmount(int dealAmount) {
	this.dealAmount = dealAmount;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getTotalCollect() {
	return totalCollect;
}
public void setTotalCollect(int totalCollect) {
	this.totalCollect = totalCollect;
}
@Override
public String toString() {
	return "DealCount [did=" + did + ", empEmailId=" + empEmailId + ", dealAmount=" + dealAmount + ", amount=" + amount
			+ ", totalCollect=" + totalCollect + "]";
}	
	


}
