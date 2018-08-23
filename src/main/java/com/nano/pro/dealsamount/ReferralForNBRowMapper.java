package com.nano.pro.dealsamount;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ReferralForNBRowMapper implements  RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
if(rs.wasNull()) {
		ReferralForNB  ref=new ReferralForNB();
		return  ref;
}else {
	ReferralForNB  ref=new ReferralForNB();
	ref.setRnbid(rs.getInt(1));
	ref.setReferralCode(rs.getString(2));
	ref.setAmount(rs.getInt(3));
	ref.setData_collected(rs.getInt(4));
		return ref;
	}

	}

}
