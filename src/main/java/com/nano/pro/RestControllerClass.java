package com.nano.pro;


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

@RestController
public class RestControllerClass {
	
	
@Autowired
public	DAOInterface  dao;



//-------------------Retrieve All Users--------------------------------------------------------
 
@RequestMapping(value = "/category/", method = RequestMethod.GET)
public ResponseEntity<List<Category>> listAllUsers() {
    List<Category> users = dao.getCategorydata();

    if(users.isEmpty()){
        return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
    }
    return new ResponseEntity<List<Category>>(users, HttpStatus.OK);
}


@RequestMapping(value = "/category/", method = RequestMethod.POST)
public ResponseEntity<List<NanoCartCategories>>  getdata(@RequestBody NanoCartCategories  nanocart){
	
	System.out.println(nanocart);
	
	String name=nanocart.getProductCategory();
	
List<NanoCartCategories>  list=	dao.getCategoryByCategoryName(name);

	return new ResponseEntity<List<NanoCartCategories>>(list, HttpStatus.OK);	
}











}
