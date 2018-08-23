package com.nano.pro.employee;

public class DealsCollection {
	
private int	dealAmount;			
private int	amount;			
private int	totalCollect;
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
	return "DealsCollection [dealAmount=" + dealAmount + ", amount=" + amount + ", totalCollect=" + totalCollect + "]";
}

}
