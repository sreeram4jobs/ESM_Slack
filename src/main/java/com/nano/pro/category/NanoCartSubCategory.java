package com.nano.pro.category;

public class NanoCartSubCategory {

private int ProductId;
private String ProductName;
private String ProductEmail;
private double ProductFee;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductEmail() {
	return ProductEmail;
}
public void setProductEmail(String productEmail) {
	ProductEmail = productEmail;
}
public double getProductFee() {
	return ProductFee;
}
public void setProductFee(double productFee) {
	ProductFee = productFee;
}
@Override
public String toString() {
	return "NanoCartSubCategory [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductEmail="
			+ ProductEmail + ", ProductFee=" + ProductFee + "]";
}

	
	
	
}
