package com.nano.pro.employee;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nano.pro.dealsamount.DAODealInterface;

@Controller
public class EmployeeControllerClass {

	
public   int count;		
	
@Autowired	
public DAOEmployeeInterfa  info;
	

	@RequestMapping(value="/employee",method=RequestMethod.POST)
public  @ResponseBody   EmployeeAllDetails getAllEmployeeDataByEmail(@RequestParam(value = "email",required=true) String   email ,@RequestParam(value = "stdate",required=true)  String stdate,@RequestParam(value = "Edate",required=true)  String Edate   ){
		
		EmployeeAllDetails  empld=new EmployeeAllDetails();
		System.out.println(email);
		
		
	EmployeeClass	  obj=info.getEmployeeDataByEmail(email);
	
	System.out.println(obj);
	
	if(obj.getReferalCode()==null) {
		  return empld;
	}else {
		
	}
	
	System.out.println("===================================");
	
	String referal=obj.getReferalCode();
	
	System.out.println("--------------------------------------");
	
	System.out.println(referal);

	
	
//	//String dateofReg = obj.getdateofreg();
//	//return 12:08:45 27/08/2018
//	//String[] date=dateofReg.split(" ");
//	//Date check=sf.parse(date[1]);
//	//if startr.ad
//	
//	System.out.println(referal);
//	
//	String email=obj.geteEmail();
//	System.out.println(email);
	
//===================ReferalMechanism  Details In For Employee=============


ReferralForNB  list1 =	info.getAllReferralForNBData(referal);


//==============================================================================
System.out.println(list1);


if(list1==null) {
return	empld;
}else {
	empld.setEmployeeReferralForNBAmount(list1.getAmount());
	empld.setEmployeeReferralForNBdata_collected(list1.getData_collected());

}


int CountForNB=info.getCountfromReferal(referal, "NB", stdate, Edate);

System.out.println(CountForNB);
empld.setEmployeeCountForReferalNB(CountForNB);
//============================================================================
ReferralForNC     list2=info.getAllReferralForNC(referal);
empld.setEmployeeReferralForNCAmount(list2.getAmount());
empld.setEmployeeReferralForNCdata_collected(list2.getData_collected());

System.out.println(list2);

int CountForNC=info.getCountfromReferal(referal, "NC", stdate, Edate);
System.out.println(CountForNC);

empld.setEmployeeCountForReferalNC(CountForNC);


List<ReferralMechanism>   list=info.getAllReferalMechanismData(referal);


System.out.println(list);

System.out.println("ReferalMechanism");


List<DealsCollection>     list3=info.getAllDealsCollectionData(email);
System.out.println(list3);

empld.setDealscollection(list3);




		return empld;
}
//	
//	
//@RequestMapping(  value="/vendorRegister",method=RequestMethod.POST)	
//public   @ResponseBody  List<VendorRegister>  getVendorRegisterBySDateAndEDate(@RequestParam String email,  @RequestParam String stDate,@RequestParam   String EDate){
//
//
//	
//List<VendorRegister>	     list1=info.getAllDataVendorRegister(email);
//	
//	System.out.println(list1);
//
//
//	for(VendorRegister vR:list1) {
//		
//String  date=vR.getDateVisit();
//		System.out.println("Vendor Register  Dates        "+date);
//		
//		System.out.println("Before Spilitting Date ");
//		
// String   args[]=date.split(" ");
//		
// 
// System.out.println("ArrayOf The Date String  "+ args);
// 
//for(int i=0;i<args.length-1;i++) {
//
//	System.out.println(count);
//	System.out.println("Date Formate By List     " +   args[1]);
//}	
//	}
//	
//	
//	
//	System.out.println(count);
//	System.out.println("Complate Date For the Vendor Table");
//
//	System.out.println(email+" "+stDate+"  "+EDate);
//	
//	return  null;
//}
	


@RequestMapping("/test")
	public  @ResponseBody  String getDataForEmployeee(@RequestParam String  email) {
		
	
	
EmployeeClass   emp=info.getEmployeeDataByEmail(email);
	
	System.out.println(emp);
	
	
String referal=	emp.getReferalCode();
	
	System.out.println("Employee ReferalMechanisam  Data By Using Referal Id "+ referal );
	
List<ReferralMechanism>	listreferal=info.getAllReferalMechanismData(referal);
	
System.out.println(listreferal);



List<ReferralMechanism>  alist=new ArrayList<ReferralMechanism>();

for(ReferralMechanism  rem:listreferal) {
	
	System.out.println(rem);
	alist.add(rem);

}

	
	return "hi";
	}
	


@RequestMapping(value="/emplocyeeupdate",method=RequestMethod.POST)
public @ResponseBody  String    updateEmployee(@RequestBody EmployeeClass  ecla) {
	
String email=ecla.geteEmail();
String password=ecla.getePassword();
int	id=info.IsExist(email, password);
	
	
	
boolean  verify	=info.updateEmployee(ecla);
	
if(verify==true) {
	return "Data is Inserted Successfully";
}else {
	System.out.println(ecla);
	
	
return  "Data is Not Inserted Successfully";	
}



}


@RequestMapping("/employeedata")	
public @ResponseBody   EmployeeClass  getAllEmployeeData(@RequestParam(value = "ememail",required=true) String ememail) {
	
EmployeeClass	emp=info.getEmployeeDataByEmail(ememail);
	
	System.out.println(emp);
	
	return  emp;
}


@RequestMapping("/deleteemployee")
public @ResponseBody  String DeleteEmployee(@RequestParam(value = "email",required=true)  String email) {
int id	=info.deleteEmployee(email);
if(id==1) {
	return "Employee is Deleted Successfully";
}else {

	return  "Employee is not Deleted";	
}

}

	
}
