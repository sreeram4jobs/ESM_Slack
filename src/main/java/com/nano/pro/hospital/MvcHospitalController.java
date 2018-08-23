package com.nano.pro.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcHospitalController {
	
@Autowired
public HospitalInterface  hospital;
	
	
	@RequestMapping("/hospital")
public @ResponseBody  List<HospitalProducts>  getDataByCategory(@RequestParam  String name){
List<HospitalProducts>		list=hospital.getAllHospitalData(name);

	return  list;
}
	
	@RequestMapping("/hospitalid")
	public @ResponseBody List<HospitalProducts>  getDataById(@RequestParam  int id){
	List<HospitalProducts>	   list=hospital.getAllHospitalDataById(id);
		
		return list;
	}
	
	
	
	
	
}
