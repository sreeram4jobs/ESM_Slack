package com.nano.pro.hospital;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HospitalRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	HospitalProducts  hpro=new HospitalProducts();
	return hpro;
}else {
	HospitalProducts  hpro=new HospitalProducts();
	hpro.setProductId(rs.getInt(1));
	hpro.setProductName(rs.getString(2));
	hpro.setProductAddress(rs.getString(3));
	hpro.setProductRating(rs.getFloat(4));
	hpro.setProductRatingCount(rs.getInt(5));
	hpro.setProductImage(rs.getString(6));
	hpro.setProductVideo(rs.getString(7));
	hpro.setProductPrice(rs.getString(8));
	hpro.setProductDescription(rs.getString(9));
	hpro.setProductServices(rs.getString(10));
	hpro.setProductFevorite(rs.getInt(11));
	hpro.setProductCategory(rs.getString(12));
	hpro.setProductOwner(rs.getString(13));
	hpro.setProductFecility(rs.getString(14));
	
	
	return hpro;
}

	}

}
