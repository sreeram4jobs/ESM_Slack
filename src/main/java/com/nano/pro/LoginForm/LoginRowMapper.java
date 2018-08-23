package com.nano.pro.LoginForm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoginRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		
		if(rs.wasNull()) {
		
LoginPage  lg=new LoginPage();
		
		return lg;
		}else {
			LoginPage  lg=new LoginPage();
lg.setUsername(rs.getString(3));
lg.setPassword(rs.getString(4));
return lg;
		}
	}

}
