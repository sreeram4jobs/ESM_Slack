package com.nano.pro.farmer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.nano.pro.supervisor.Supervisor;


@RestController
public class FarmerController {

@Autowired
public FarmerInterface   far;	
	
@RequestMapping("/farmer/")
public List<FarmerClass>	getAllFarmerData(){
	
List<FarmerClass>  list=	far.getAllFarmerdata();
	
	return  list;
}


}
