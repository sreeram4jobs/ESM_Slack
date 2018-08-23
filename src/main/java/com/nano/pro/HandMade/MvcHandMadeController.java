package com.nano.pro.HandMade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcHandMadeController {
@Autowired
public HandMadeInterface  intetr;
	
@RequestMapping("handmade")
public @ResponseBody  List<HandMadeCategory>  getDataByCategory(@RequestParam String name   ){	
List<HandMadeCategory>		list=intetr.getDataByCategory(name);

	return  list;	
	}
	
	
	
	
	
}
