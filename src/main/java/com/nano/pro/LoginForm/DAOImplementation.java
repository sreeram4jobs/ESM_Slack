package com.nano.pro.LoginForm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.nano.pro.employee.ReferralForNB;


@Service
public class DAOImplementation implements  DAOInterfece{


	@Autowired
	public JdbcTemplate  jdbctemplate;
	
	
	
	
	public LoginPage getdata(LoginPage log) {

		String designation=log.getDesignation();

		Object  args[]= {log.getUsername(),log.getPassword()};
		
		if(designation.equals("Executive")) {

			String sql="select * from Employees  where eEmail=? && ePassword=?";
			
//			List<LoginPage>    lo = jdbctemplate.query(sql, args, new LoginRowMapper());
//System.out.println("Executive");
					






List<LoginPage>   list= jdbctemplate.query(sql, args, new RowMapper<LoginPage>() {
    public LoginPage mapRow(ResultSet rs, int rowNum) throws SQLException {
       
    	LoginPage  nb=new LoginPage();
    nb.setUsername(rs.getString(3));
    nb.setPassword(rs.getString(4));
        return nb;
     }
 });
  if (list.isEmpty()) {
	    return null;
	} else {
	    return list.get(0);
	}


		
		}else if(designation.equals("Supervisor")) {
String sql="select *  from Supervisor  where emailSupervisor=? && passwordSupervisor=?";
//List<LoginPage>    lo = jdbctemplate.query(sql, args, new LoginRowMapper());
//			
//System.out.println("Supervisor");

List<LoginPage>   list= jdbctemplate.query(sql, args, new RowMapper<LoginPage>() {
    public LoginPage mapRow(ResultSet rs, int rowNum) throws SQLException {
       
    	LoginPage  nb=new LoginPage();
    nb.setUsername(rs.getString(3));
    nb.setPassword(rs.getString(4));
        return nb;
     }
 });
  if (list.isEmpty()) {
	    return null;
	} else {
	    return list.get(0);
	}



			
			
		}else if(designation.equals("Franchise")) {
		
			
			String sql="select * from Franchise  where FranchiseEmail=? && FranchisePassword=?";
//			List<LoginPage>    lo = jdbctemplate.query(sql, args, new LoginRowMapper());
//
//			System.out.println("Franchise");
			
			
			
			List<LoginPage>   list= jdbctemplate.query(sql, args, new RowMapper<LoginPage>() {
			    public LoginPage mapRow(ResultSet rs, int rowNum) throws SQLException {
			       
			    	LoginPage  nb=new LoginPage();
			    nb.setUsername(rs.getString(3));
			    nb.setPassword(rs.getString(4));
			        return nb;
			     }
			 });
			  if (list.isEmpty()) {
				    return null;
				} else {
				    return list.get(0);
				}
			
			
			
			
			
		}else {

			return null;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
