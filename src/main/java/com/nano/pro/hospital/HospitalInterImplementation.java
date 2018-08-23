package com.nano.pro.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class HospitalInterImplementation implements HospitalInterface{
@Autowired
public JdbcTemplate  jdbctemplate;	
	
	
	public List<HospitalProducts> getAllHospitalProducts() {

String sql="select * from Hospital";
		
 List<HospitalProducts>     list=jdbctemplate.query(sql, new HospitalRowMapper());


		return list;
	}


	public List<HospitalProducts> getAllHospitalData(String name) {

String sql="select * from Hospital where  hpCategory=?";
		Object args[]= {name};
		
List<HospitalProducts>	   list=	jdbctemplate.query(sql, args,new HospitalRowMapper());

		
		return list;
	}


	public List<HospitalProducts> getAllHospitalDataById(int id) {

String sql="select * from Hospital where hpid=?";
Object args[]= {id};
 List<HospitalProducts>      list=jdbctemplate.query(sql, args, new HospitalRowMapper());
		
		return list;
	}

}
