package com.nano.pro;

public class Category {
private int ProductId;
private String ProductName;
private String ProductImage;
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
public String getProductImage() {
	return ProductImage;
}
public void setProductImage(String productImage) {
	ProductImage = productImage;
}

@Override
public String toString() {
	return "Category [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductImage=" + ProductImage + "]";
}

	
}
