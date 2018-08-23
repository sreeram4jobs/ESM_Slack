package com.nano.pro.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class CategoryImplementationClass implements  CategoryInterface{

@Autowired
public JdbcTemplate  jdbctemplate;	
	
	public List<NanoCartSubCategory> getAllCategory() {

String sql="select * from NanocartsubCategory";


System.out.println("Category data is Before Excecuting");
List<NanoCartSubCategory>       list=(List<NanoCartSubCategory>)jdbctemplate.query(sql, new CategoryRowMapper());
System.out.println("Category data is After Excecuting");

		return list;
	}

	
	public boolean isNanoCartSubCategoryExist(NanoCartSubCategory sub) {

String sql="select * from NanocartsubCategory  where ProductName=?";

Object  args[]= {sub.getProductName()};
 List<NanoCartSubCategory>     list=jdbctemplate.query(sql, args, new CategoryRowMapper());

 
 if(list==null) {
	 System.out.println("false");
	 return true; 
 }else {
	 System.out.println("true");
	 return false;
 }
 



	}

	public int saveNanoCartSubCategory(NanoCartSubCategory nacsu) {

String sql="insert into NanocartsubCategory  values(?,?,?,?)";

Object args[]= {nacsu.getProductId(),nacsu.getProductName(),nacsu.getProductEmail(),nacsu.getProductFee()};

  int  id=jdbctemplate.update(sql, args);
		
		
		return id;
	}

	public NanoCartSubCategory findById(long id) {

		
		
		System.out.println("Configure==================================");
		Object args[]= {id};
String sql="select * from NanocartsubCategory  where ProductId=?";
NanoCartSubCategory    cate=jdbctemplate.queryForObject(sql, args, new CategoryRowMapper());
System.out.println("After Configuration=============================================");
		System.out.println(cate);
		return cate;
	}

}
