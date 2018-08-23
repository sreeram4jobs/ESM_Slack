package com.nano.pro.HandMade;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface HandMadeInterface {

	public List<HandMadeCategory>	getAllHandMadeCategory();
	
	
public List<HandMadeCategory>   getDataByCategory(String name);	
	
}
