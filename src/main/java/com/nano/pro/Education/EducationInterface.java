package com.nano.pro.Education;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("cardsd")
public interface EducationInterface {

	
public List<Education>	getAllCardsCategory();
	

public List<Education>  getDataByCategory(String name);


 
}
