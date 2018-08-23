package com.nano.pro.dealsamount;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NCRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

if(rs.wasNull()) {
	ReferralForNC  nc=new ReferralForNC();
	return nc; 
}else {
	ReferralForNC  nc=new ReferralForNC();
	nc.setRncid(rs.getInt(1));
	nc.setReferralCode(rs.getString(2));
	nc.setAmount(rs.getInt(3));
	nc.setData_collected(rs.getInt(4));
return nc;
}
		
		
	}

}
