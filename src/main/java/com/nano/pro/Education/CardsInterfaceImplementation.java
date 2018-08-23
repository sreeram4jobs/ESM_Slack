package com.nano.pro.Education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nano.pro.category.NanoCartSubCategory;

@Service
public class CardsInterfaceImplementation implements  EducationInterface{

	
@Autowired	
public JdbcTemplate  jdbctemplate;	
	
	
	public List<Education> getAllCardsCategory() {

		
		String sql="select * from Education";
		
List<Education>		list=(List<Education>)jdbctemplate.query(sql, new EducationRowMapper());

		
		
		return list;
	}

	public boolean isNanoCartCadsExist(Education nanc) {

String sql="select * from NanocartCars  where SubcategoryName=?";
		
Object args[]= {nanc.getProductId()};
System.out.println("Database Connection");
List<Education>     cate=jdbctemplate.query(sql, args, new EducationRowMapper());
System.out.println("Database Connection is Successfully Completed");
if(cate==null) {
	return  true;
}else {

	return false;
}



	}

	public List<Education> getDataByCategory(String name) {

		
Object args[]= {name};		
		
String sql="select * from Education where  edCategory=?";

List<Education>       list=jdbctemplate.query(sql, args, new EducationRowMapper());



		
		
		return list;
	}

	
	
	
}
