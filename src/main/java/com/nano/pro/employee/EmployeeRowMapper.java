package com.nano.pro.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements  RowMapper<EmployeeClass>{

	public EmployeeClass mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	EmployeeClass  ec=new EmployeeClass();
	return ec;
}else {
	EmployeeClass  ec=new EmployeeClass();
	ec.setEid(rs.getInt(1));
	ec.seteName(rs.getString(2));
	ec.seteEmail(rs.getString(3));
	ec.setePassword(rs.getString(4));
	ec.seteMobile(rs.getString(5));
	ec.seteAddress(rs.getString(6));
	ec.setReferalCode(rs.getString(7));
	ec.seteImage(rs.getString(8));
	ec.seteStatus(rs.getString(9));
	return ec;
}

	}

	
	
}
