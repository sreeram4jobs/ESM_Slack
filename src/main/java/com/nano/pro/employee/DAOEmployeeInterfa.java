package com.nano.pro.employee;

import java.util.List;

import org.springframework.stereotype.Service;


public interface DAOEmployeeInterfa {

public List<ReferralMechanism>  getAllReferalMechanismData(String refaral);

public ReferralForNB  getAllReferralForNBData(String referal);

public ReferralForNC getAllReferralForNC(String referal);

public List<DealsCollection>  getAllDealsCollectionData(String email);

public List<VendorRegister>  getAllDataVendorRegister(String email);

public Vendor_details  getAllVendor_details(String name);

public int getCountfromReferal(   String referalId,String category,String stDate,String EDate);
//============================================================
public EmployeeClass  getEmployeeDataByEmail(String name);	
public boolean  updateEmployee(EmployeeClass  empcl);

public int IsExist(String email,String password);
public int deleteEmployee(String empemail);


}
