package com.nano.pro;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nano.pro.HandMade.HandMadeCategory;
import com.nano.pro.HandMade.HandMadeRowmapper;
@Service("dao")
public class DAOImplementations implements  DAOInterface{

@Autowired	
public JdbcTemplate  jdbctemplate;



public List<Category> getCategorydata() {

String sql="select * from  NanoCartProducts";


List<Category>		list=(List<Category>)jdbctemplate.query(sql, new CategoryRowmapper());

	return list;
}


public List<NanoCartCategories> getCategoryByCategoryName(String name) {

	System.out.println(name);
	String sql="select * from  NanoCartCategories  where cCategory=?";
			
Object  args[]= {name};
	

List<NanoCartCategories>   list=(List<NanoCartCategories>)jdbctemplate.query(sql, args,new NanoCartCategoryRowMapper());

	return list;
}

}




