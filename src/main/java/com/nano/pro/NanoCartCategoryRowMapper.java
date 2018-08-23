package com.nano.pro;

import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NanoCartCategoryRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		
		if(rs.wasNull()) {

		NanoCartCategories  cate=new NanoCartCategories();
		
		return  cate;
		
		}else {
			
			NanoCartCategories  cate=new NanoCartCategories();
    
//	
			cate.setProductId(rs.getInt(1));

		cate.setProductName(rs.getString(2));
	
			cate.setProductImage(rs.getString(3));
		
	
		cate.setProductCategory(rs.getString(4));
		
		
		
		
	
		
		return cate;
}

		
					
	}


}
