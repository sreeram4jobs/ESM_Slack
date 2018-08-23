package com.nano.pro.farmer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FarmerRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	FarmerClass  fr=new FarmerClass();
	
	return fr;
}else {
	FarmerClass  fr=new FarmerClass();
fr.setProductFId(rs.getInt(1));
fr.setProductFName(rs.getString(2));
fr.setProductFAddress(rs.getString(3));
fr.setProductFRating(rs.getFloat(4));
fr.setProductFRatingCount(rs.getInt(5));
fr.setProductFImage(rs.getString(6));
fr.setProductFVideo(rs.getString(7));
fr.setProductFPrice(rs.getDouble(8));
fr.setProductFDescription(rs.getString(9));
fr.setProductFService(rs.getString(10));
fr.setProductFFevorite(rs.getInt(11));
fr.setProductFCategory(rs.getString(12));
fr.setProductFOwner(rs.getString(13));
fr.setProductFFecility(rs.getString(14));

	return fr;
}

	}

	
}
