package com.nano.pro.LoginForm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerFile {

@Autowired	
public DAOImplementation  inter;	
	
	
	@RequestMapping("/sankar")
public String getdata(HttpServletRequest  req,HttpServletResponse  res) {
	
		String name=req.getParameter("name");
		System.out.println(name);
		return "hi";
}
	
	
	
	@RequestMapping(value="/loginform" ,method=RequestMethod.POST)	
	public @ResponseBody LoginSuccess getLoginData( @RequestBody LoginPage   login) {
		String designation=login.getDesignation();

		System.out.println(login);
		
//		if(login.getUsername()==null) {
//			return "User Name Required";
//		}else if(login.getPassword()==null) {
//			return "Password Should  Required";
//		}
//		
		LoginSuccess  ls=new LoginSuccess();
		
		
	if(designation.equals("Executive")) {

		
		LoginPage   log=inter.getdata(login);
		System.out.println(log);

		if(log==null) {
			
			ls.setStatuscode("204");
			ls.setMessage("Data is Not Available");
			return ls;
		}else {
		
			ls.setStatuscode("200");
			ls.setMessage("Data is Successfull");
			return ls;
		}
		
		
		
		
	}else if(designation.equals("Supervisor")) {
		LoginPage   log=inter.getdata(login);
		System.out.println(log);
		if(log==null) {
			ls.setStatuscode("204");
			ls.setMessage("Data is Not Available");
			return ls;
		}else {
			ls.setStatuscode("200");
			ls.setMessage("Data is Successfull");
			return ls;
		}
		
	}else if(designation.equals("Franchise")) {
		LoginPage   log=inter.getdata(login);
		System.out.println(log);
		
		if(log==null) {
			ls.setStatuscode("204");
			ls.setMessage("Data is Not Available");
			return ls;
		}else {
			ls.setStatuscode("200");
			ls.setMessage("Data is Successfull");
			return ls;
		}
		
		
		
	}else {

		return null;
	}

	}
}
