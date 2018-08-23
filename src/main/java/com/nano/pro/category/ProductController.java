
package com.nano.pro.category;
import java.util.ArrayList;
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
public class ProductController {

@Autowired	
public CategoryInterface ser;	
	
	@RequestMapping(value = "/nano/", method = RequestMethod.GET)
    public ResponseEntity<List<NanoCartSubCategory>> listAllUsers() {      
        NanoCartSubCategory nano=new NanoCartSubCategory();
        List<NanoCartSubCategory> users = ser.getAllCategory();
        
        System.out.println(nano);
        if(users.isEmpty()){
            return new ResponseEntity<List<NanoCartSubCategory>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<NanoCartSubCategory>>(users, HttpStatus.OK);
    }
  
	 //-------------------Create a User--------------------------------------------------------
    
    @RequestMapping(value = "/nanouser/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody NanoCartSubCategory user,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getProductName());
  
        
 
        System.out.println(user);
        if (ser.isNanoCartSubCategoryExist(user)) {
            System.out.println("A User with name " + user.getProductName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
  
        ser.saveNanoCartSubCategory(user);
  
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getProductId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
  
     
    
    //-------------------Retrieve Single User--------------------------------------------------------
      
    @RequestMapping(value = "/nano/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NanoCartSubCategory> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        NanoCartSubCategory user = ser.findById(id);
        
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<NanoCartSubCategory>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<NanoCartSubCategory>(user, HttpStatus.OK);
    }
  
    	
	
	
	
	
	
}
