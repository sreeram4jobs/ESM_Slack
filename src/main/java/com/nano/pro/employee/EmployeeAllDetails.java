package com.nano.pro.employee;

import java.util.List;

public class EmployeeAllDetails {
	
private int EmployeeReferralForNBAmount;
private int EmployeeReferralForNBdata_collected;
private int EmployeeCountForReferalNB;


private int EmployeeReferralForNCAmount;
private int EmployeeReferralForNCdata_collected;
private int EmployeeCountForReferalNC;
//private int EmployeeDealsCollectiondealAmount;
//private int EmployeeDealsCollectionAmount;
//private int EmployeeDealsCollectionTotalAmount;





public List<DealsCollection>  dealscollection;



public List<DealsCollection> getDealscollection() {
	return dealscollection;
}





public void setDealscollection(List<DealsCollection> dealscollection) {
	this.dealscollection = dealscollection;
}





//public List<DealsCollection>  EmployeedealsCollectiom;


//public List<ReferralForNB>  EmployeereferralFornb;
	


//public List<ReferralForNC>  EmployeereferralFornc;

public ReferralMechanism  referalmechanism;






public int getEmployeeCountForReferalNC() {
	return EmployeeCountForReferalNC;
}





public void setEmployeeCountForReferalNC(int employeeCountForReferalNC) {
	EmployeeCountForReferalNC = employeeCountForReferalNC;
}





public int getEmployeeCountForReferalNB() {
	return EmployeeCountForReferalNB;
}





public void setEmployeeCountForReferalNB(int employeeCountForReferalNB) {
	EmployeeCountForReferalNB = employeeCountForReferalNB;
}









public int getEmployeeReferralForNBAmount() {
	return EmployeeReferralForNBAmount;
}





public void setEmployeeReferralForNBAmount(int employeeReferralForNBAmount) {
	EmployeeReferralForNBAmount = employeeReferralForNBAmount;
}





public int getEmployeeReferralForNBdata_collected() {
	return EmployeeReferralForNBdata_collected;
}





public void setEmployeeReferralForNBdata_collected(int employeeReferralForNBdata_collected) {
	EmployeeReferralForNBdata_collected = employeeReferralForNBdata_collected;
}





public int getEmployeeReferralForNCAmount() {
	return EmployeeReferralForNCAmount;
}





public void setEmployeeReferralForNCAmount(int employeeReferralForNCAmount) {
	EmployeeReferralForNCAmount = employeeReferralForNCAmount;
}





public int getEmployeeReferralForNCdata_collected() {
	return EmployeeReferralForNCdata_collected;
}





public void setEmployeeReferralForNCdata_collected(int employeeReferralForNCdata_collected) {
	EmployeeReferralForNCdata_collected = employeeReferralForNCdata_collected;
}





public ReferralMechanism getReferalmechanism() {
	return referalmechanism;
}





public void setReferalmechanism(ReferralMechanism referalmechanism) {
	this.referalmechanism = referalmechanism;

}





@Override
public String toString() {
	return "EmployeeAllDetails [EmployeeReferralForNBAmount=" + EmployeeReferralForNBAmount
			+ ", EmployeeReferralForNBdata_collected=" + EmployeeReferralForNBdata_collected
			+ ", EmployeeCountForReferalNB=" + EmployeeCountForReferalNB + ", EmployeeReferralForNCAmount="
			+ EmployeeReferralForNCAmount + ", EmployeeReferralForNCdata_collected="
			+ EmployeeReferralForNCdata_collected + ", EmployeeCountForReferalNC=" + EmployeeCountForReferalNC
			+ ", dealscollection=" + dealscollection + ", referalmechanism=" + referalmechanism + "]";
}





//public List<ReferralMechanism>  EmployeereferralMechanism;



}