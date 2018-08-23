package com.nano.pro.HandMade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nano.pro.Category;



@RestController
public class HandMadeController {

@Autowired
public HandMadeInterface  handmadeinter;	

	@RequestMapping(value = "/handmade/", method = RequestMethod.GET)
	public ResponseEntity<List<HandMadeCategory>> listAllUsers() {
	    List<HandMadeCategory> users = handmadeinter.getAllHandMadeCategory();

	    if(users.isEmpty()){
	        return new ResponseEntity<List<HandMadeCategory>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	    }
	    return new ResponseEntity<List<HandMadeCategory>>(users, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
}
