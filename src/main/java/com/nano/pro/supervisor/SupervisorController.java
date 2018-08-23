package com.nano.pro.supervisor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
public class SupervisorController {
	
	@Autowired
	public SupervisorInterface  supervisorinterfa;

	@RequestMapping("/undersupervisor")
public  @ResponseBody  List<UnderSupervisor> getAllData(@RequestParam     String supemail){	
		System.out.println(supemail);
		
	
	List<UnderSupervisor>  list=supervisorinterfa.getAllUnderSupervisor(supemail);
System.out.println(list);
return list;
}


@RequestMapping("/supervisordata")	
public   @ResponseBody Supervisor  getdatasupervisor(@RequestParam    String supemail) {
Supervisor	supervis=supervisorinterfa.getdatasupervisor(supemail);
	
	return supervis;
}
	

@RequestMapping(value="/supervisorupdate",method=RequestMethod.POST)
public @ResponseBody  String Updatesupervisordata(@RequestBody   Supervisor  superupda) {
	 
	
	
	System.out.println(superupda);
	int id=supervisorinterfa.updateSupervisor(superupda);
	System.out.println(id);
	if(id==0) {
		return "Data  is Not Updated";
	}else {
		
		
		return  "Superviosr Data is Updated Successfully";
	}
	

	
}

	
}
