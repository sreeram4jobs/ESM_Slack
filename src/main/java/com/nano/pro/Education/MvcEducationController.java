package com.nano.pro.Education;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcEducationController {
@Autowired
public EducationInterface  cardsd;
	
	
	@RequestMapping("/education")
public @ResponseBody  List<Education> GetDataByCategory(@RequestParam String name) {
  
List<Education>  list=cardsd.getDataByCategory(name);
		
		
		
	return list;
}
	
	
	
	
}
