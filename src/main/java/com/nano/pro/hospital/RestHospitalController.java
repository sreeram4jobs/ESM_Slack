package com.nano.pro.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nano.pro.Education.Education;

@RestController
public class RestHospitalController {
@Autowired
public HospitalInterface  inter;	
	
	
	@RequestMapping( "/hospital/")
    public ResponseEntity<List<HospitalProducts>> listAllUsers() {      
        
        List<HospitalProducts> cards = inter.getAllHospitalProducts();
        System.out.println(cards);
        if(cards.isEmpty()){
            return new ResponseEntity<List<HospitalProducts>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<HospitalProducts>>(cards, HttpStatus.OK);
    }
  		
	
	
	
	
}
