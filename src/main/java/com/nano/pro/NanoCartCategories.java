package com.nano.pro;


public class NanoCartCategories {
private int ProductId;
private String ProductName;
private String ProductImage;
private String ProductCategory;

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
public String getProductCategory() {
	return ProductCategory;
}
public void setProductCategory(String productCategory) {
	ProductCategory = productCategory;
}
@Override
public String toString() {
	return "NanoCartCategories [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductImage="
			+ ProductImage + ", ProductCategory=" + ProductCategory + "]";
}

}
