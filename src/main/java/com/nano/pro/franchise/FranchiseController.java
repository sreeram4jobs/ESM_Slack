package com.nano.pro.franchise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nano.pro.Education.Education;

@RestController
public class FranchiseController {

	
	
@Autowired	
public FranchiseDAOInterface  interfac;	

@RequestMapping("/franchise")
public @ResponseBody FranchiseClasss getFranchisedataByEmail(@RequestParam  String email) { 
System.out.println(email);

FranchiseClasss   fran=interfac.getFranchiseByEmailId(email);

return fran;
}


@RequestMapping("/underfranchise")
public @ResponseBody  List<UnderFranchise> getDataUnderFranchiseByFranchiseEmail(@RequestParam String email) {
System.out.println(email);
	List<UnderFranchise>	list=interfac.getAllDataUnderSupervisor(email);
	System.out.println(list);
return list;
	
}

@RequestMapping(value="/updatefranchise",method=RequestMethod.POST)
public @ResponseBody  String updateFranchise(@RequestBody  FranchiseClasss update) {
	
	System.out.println(update);
	
 int  id=interfac.updatefranchise(update);
	if(id==0) {
		return  "Data is Not Updated";
	}else {
		
		return "Data Is Updated Successfully";	
	}
	
	
}
@RequestMapping("/deletefranchise")
public @ResponseBody  String DeleteFranchiseByEmail(@RequestParam String email) {
	System.out.println(email);
int id=	interfac.DeleteFranchise(email);
System.out.println(id);
if(id==0){
	return "Data is not Deleted";
}else {
	return  "Data is Deleted Successfully";
}

}



}
