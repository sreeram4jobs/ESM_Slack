package com.nano.pro.farmer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nano.pro.category.CategoryRowMapper;
import com.nano.pro.category.NanoCartSubCategory;
import com.nano.pro.supervisor.Supervisor;

@Service
public class FarmerImplementation implements  FarmerInterface{

	
	
@Autowired	
private JdbcTemplate  jdbctemplate;

public List<FarmerClass> getAllFarmerdata() {

String sql="select * from   Farmer";

List<FarmerClass>   list=     list=jdbctemplate.query(sql, new FarmerRowMapper());


	return list;
}
	
	
}
