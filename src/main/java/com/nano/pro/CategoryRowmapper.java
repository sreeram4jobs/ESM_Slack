package com.nano.pro;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryRowmapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
if(rs.wasNull()) {
	Category  cate=new Category();
	return  cate;
}else {
	Category  cate=new Category();

	cate.setProductId(rs.getInt(1));
	cate.setProductName(rs.getString(2));
	cate.setProductImage(rs.getString(3));
	
	return cate;
}

	
	
	}



}
