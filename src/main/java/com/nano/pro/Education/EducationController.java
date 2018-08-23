package com.nano.pro.Education;

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

import com.nano.pro.category.NanoCartSubCategory;

@RestController
public class EducationController {

@Autowired	
public EducationInterface  cardsd;	
	
	
	@RequestMapping(value = "/education/", method = RequestMethod.GET)
    public ResponseEntity<List<Education>> listAllUsers() {      
        
        List<Education> cards = cardsd.getAllCardsCategory();
        System.out.println(cards);
        if(cards.isEmpty()){
            return new ResponseEntity<List<Education>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Education>>(cards, HttpStatus.OK);
    }

}
