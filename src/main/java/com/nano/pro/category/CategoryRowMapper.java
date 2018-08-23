package com.nano.pro.category;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryRowMapper implements  RowMapper{

public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	NanoCartSubCategory  nancs=new NanoCartSubCategory();
System.out.println("Data is Not Available");
	return  nancs;
}else {
	
	NanoCartSubCategory  nancs=new NanoCartSubCategory();
	nancs.setProductId(rs.getInt(1));
	nancs.setProductName(rs.getString(2));
	nancs.setProductEmail(rs.getString(3));
	nancs.setProductFee(rs.getDouble(4));
	return  nancs;
}

	}

}
