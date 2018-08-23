package com.nano.pro.dealsamount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nano.pro.LoginForm.LoginPage;
import com.nano.pro.LoginForm.LoginRowMapper;

@Service
public class DAOOmplementationDeal implements  DAODealInterface{

	@Autowired
	public JdbcTemplate  jdbctemplate;

	public List<DealCount> getDataByEmail(String name) {

		
		Object  args[]= {name};
		String sql="select * from DealsCollection    where empEmailId=?";
	 List<DealCount>   list=	jdbctemplate.query(sql, args, new DealRowMapper());

		return  list;
	}

	public List<ReferralForNB> getDataByReferalCode(String name) {

Object  args[]= {name};		
		
String sql="select * from  ReferralForNB  where referralCode=?";
List<ReferralForNB>     list= jdbctemplate.query(sql, args, new  ReferralForNBRowMapper());
		return list;
	}

	public List<ReferralForNC> getDataByReferalReferralForNC(String name) {
Object  args[]= {name};
String sql="select * from ReferralForNC  where referralCode=?";
List<ReferralForNC>    list=jdbctemplate.query(sql, args, new NCRowMapper());
		return list;
	}
	
}
