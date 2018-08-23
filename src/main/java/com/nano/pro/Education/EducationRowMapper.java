package com.nano.pro.Education;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EducationRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

	if(rs.wasNull()) {
		Education  cards=new Education();
		return  cards;
	}else {
	Education  ed=new Education();
	ed.setProductId(rs.getInt(1));
	ed.setProductName(rs.getString(2));
	ed.setProductAddress(rs.getString(3));
	ed.setProductRating(rs.getFloat(4));
	ed.setProductRatingCount(rs.getInt(5));
	ed.setProductImage(rs.getString(6));
	ed.setProductVideo(rs.getString(7));
	ed.setProductPrice(rs.getString(8));
	ed.setProductDescription(rs.getString(9));
	ed.setProductServices(rs.getString(10));
	ed.setProductFevorite(rs.getInt(11));
	ed.setProductCategory(rs.getString(12));
	ed.setProductOwner(rs.getString(13));
	ed.setProductFecility(rs.getString(14));
return ed;
	}
		
	
	}

}
