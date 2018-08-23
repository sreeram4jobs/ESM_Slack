package com.nano.pro.HandMade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;



@Service
public class HandMadeInterfaceImplementation implements  HandMadeInterface{

@Autowired	
public JdbcTemplate  jdbctemplate;	
	
	
	public List<HandMadeCategory> getAllHandMadeCategory() {

		
		String sql="select * from Handmade";
		
List<HandMadeCategory>		list=(List<HandMadeCategory>)jdbctemplate.query(sql, new HandMadeRowmapper());

		
		
		
		return list;
	}


	public List<HandMadeCategory> getDataByCategory(String name) {

String sql="select * from Handmade  where hmCategory=?";
Object args[]= {name};
List<HandMadeCategory>      list=jdbctemplate.query(sql, args, new HandMadeRowmapper());
		
		return list;
	}

	
	
}
