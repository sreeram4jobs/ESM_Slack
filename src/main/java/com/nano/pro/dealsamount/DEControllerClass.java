package com.nano.pro.dealsamount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DEControllerClass {

	
@Autowired	
public DAODealInterface  inte;	
	
	
@RequestMapping("/dealcollection")
public @ResponseBody  List<DealCount> getData(@RequestParam  String name) {
	System.out.println(name);
List<DealCount>	   list=inte.getDataByEmail(name);

System.out.println(list);


		return  list;
}
	
	
@RequestMapping("/referal")
public @ResponseBody  List<ReferralForNB> getDataByRefral(@RequestParam  String name) {
	System.out.println(name);
List<ReferralForNB>	   list=inte.getDataByReferalCode(name);

System.out.println(list);


		return  list;
}
	
@RequestMapping("/ReferalNC")
public @ResponseBody List<ReferralForNC>  getdataByNCEmail(@RequestParam  String name){
List<ReferralForNC>		list=inte.getDataByReferalReferralForNC(name);
	System.out.println(list);
return  list;		
}
	
	
}
