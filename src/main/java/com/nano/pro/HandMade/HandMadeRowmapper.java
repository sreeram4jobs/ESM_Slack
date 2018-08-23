package com.nano.pro.HandMade;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HandMadeRowmapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		if(rs.wasNull()) {
			HandMadeCategory  hcat=new HandMadeCategory();
			return hcat;
		}else {
			HandMadeCategory  hcat=new HandMadeCategory();
			hcat.setProductHId(rs.getInt(1));
			hcat.setProductHName(rs.getString(2));
			hcat.setProductHAddress(rs.getString(3));

			hcat.setProductHRating(rs.getFloat(4));
			hcat.setProductHRatingCount(rs.getInt(5));
			hcat.setProductHImage(rs.getString(6));
			hcat.setProductHVideo(rs.getString(7));
			hcat.setProductHPrivce(rs.getString(8));
			hcat.setProductHDescription(rs.getString(9));
			hcat.setProductHServices(rs.getString(10));
			hcat.setProductHFevorite(rs.getInt(11));
			hcat.setProductHOwner(rs.getString(13));
			hcat.setProductHFecility(rs.getString(14));
			return hcat;

		}
		
	}

}
