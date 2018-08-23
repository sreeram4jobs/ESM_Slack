package com.nano.pro.dealsamount;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DealRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	DealCount  dec=new DealCount();
	return  dec;
}else {
	DealCount  dec=new DealCount();
	dec.setDid(rs.getInt(1));
	dec.setEmpEmailId(rs.getString(2));
	dec.setDealAmount(rs.getInt(3));
	dec.setAmount(rs.getInt(4));
	dec.setTotalCollect(rs.getInt(5));
	return  dec;

}

	}

}
