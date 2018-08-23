package com.nano.pro.franchise;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.nano.pro.employee.EmployeeClass;
import com.nano.pro.employee.ReferralForNB;
import com.nano.pro.supervisor.UnderSupervisor;
@Service
public class FranchiseDAOImplementation implements  FranchiseDAOInterface{

	
@Autowired	
public JdbcTemplate  jdbctemplate;

public FranchiseClasss getFranchiseByEmailId(String email) {

	
	Object  args[]= {email};
String sql="select * from Franchise where FranchiseEmail=?";
	
List<FranchiseClasss>   list= jdbctemplate.query(sql, new Object[] {email}, new RowMapper<FranchiseClasss>() {
    public FranchiseClasss mapRow(ResultSet rs, int rowNum) throws SQLException {
       
    	FranchiseClasss  fr=new FranchiseClasss();
   fr.setIdFranchise(rs.getInt(1));
   fr.setFranchiseName(rs.getString(2));
   fr.setFranchiseEmail(rs.getString(3));
   fr.setFranchisePassword(rs.getString(4));
   fr.setFranchiseDateOfIssue(rs.getString(5));
   fr.setFranchisePinNumber(rs.getString(6));
   fr.setFranchiseNonRefundbleDeposite(rs.getString(7));
   fr.setFranchise3DigitCode(rs.getString(8));
   fr.setFranchiseTemparary_Perminent(rs.getString(9));
   fr.setFranchiseNumber(rs.getInt(10));
   fr.setFranchiseAaDharCardNumber(rs.getString(11));
   fr.setFranchiseBankAccount(rs.getString(12));
   fr.setFranchiseField(rs.getString(13));
        return fr;
     }
 });
  if (list.isEmpty()) {
	    return null;
	} else {
	    return list.get(0);
	}
	
	
}

public int updatefranchise(FranchiseClasss emc) {
	Object args[]= {emc.getFranchiseName(),emc.getFranchiseDateOfIssue(),emc.getFranchisePinNumber(),emc.getFranchiseNonRefundbleDeposite(),emc.getFranchise3DigitCode(),emc.getFranchiseTemparary_Perminent(),emc.getFranchiseNumber(),emc.getFranchiseAaDharCardNumber(),emc.getFranchiseBankAccount(),emc.getFranchiseField(),emc.getFranchiseEmail()};
String sql="update Franchise  set  FranchiseName=?,FranchiseDateOfIssue=?,FranchisePinNumber=?,FranchiseNonRefundbleDeposite=?,Franchise3DigitCode=?,FranchiseTemparary_Perminent=?,FranchiseNumber=?,FranchiseAaDharCardNumber=?,FranchiseBankAccount=?,FranchiseField=? where    FranchiseEmail=? ";
int id=jdbctemplate.update(sql, args);




return id;
}

public int DeleteFranchise(String email) {
Object args[]= {email};
String sql="delete from Franchise where  FranchiseEmail=? ";
	
int id=jdbctemplate.update(sql, args);
	return id;
}

public List<UnderFranchise> getAllDataUnderSupervisor(String email) {

Object  args[]= {email};	
	
String sql="select * from UnderFranchise  where FranchiseEmail=?";
	
		List<UnderFranchise>   list= jdbctemplate.query(sql, new Object[] {email}, new RowMapper<UnderFranchise>() {
		    public UnderFranchise mapRow(ResultSet rs, int rowNum) throws SQLException {
		       
		    	UnderFranchise  fr=new UnderFranchise();
		    	fr.setUnderFranId(rs.getInt(1));
		    	fr.setUnderFranchiseEmploName(rs.getString(2));
fr.setFranchiseEmail(rs.getString(3));

		        return fr;
		     }
		 });
		  
			
	return list;
}

//public UnderFranchise getfranchiseByEmail(String email) {
//String sql="select * from UnderFranchise  where FranchiseEmail=?";
//List<UnderFranchise>   list= jdbctemplate.query(sql, new Object[] {email}, new RowMapper<UnderFranchise>() {
//    public UnderFranchise mapRow(ResultSet rs, int rowNum) throws SQLException {
//       
//    	UnderFranchise  fr=new UnderFranchise();
//    	fr.setUnderFranId(rs.getInt(1));
//    	fr.setUnderFranchiseEmploName(rs.getString(2));
//fr.setFranchiseEmail(rs.getString(3));
//
//        return fr;
//     }
// });
//  
//	
//return list;
//}


}
