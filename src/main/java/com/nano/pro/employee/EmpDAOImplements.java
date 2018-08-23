package com.nano.pro.employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
@Service
public class EmpDAOImplements implements  DAOEmployeeInterfa{

@Autowired	
public JdbcTemplate  jdbctemplate;	
	
	public EmployeeClass getEmployeeDataByEmail(String name) {

		
		String sql="select * from Employees    where eEmail=? ";
//		
//		Object args[]= {name};
//		List<EmployeeClass> strLst  = jdbctemplate.query(sql, args  , new RowMapper<EmployeeClass> {
//
//			  EmployeeClass mapRow(ResultSet rs, int id) throws SQLException {
//			        EmployeeClass  cl=new EmployeeClass();
//				  cl.setEid(rs.getInt(1));
//				  cl.seteName(rs.getString(2));
//				  cl.seteEmail(rs.getString(3));
//				  cl.setePassword(rs.getString(4));
//				  cl.seteMobile(rs.getString(5));
//				  cl.seteAddress(rs.getString(6));
//				  cl.setReferalCode(rs.getString(7));
//				  cl.seteImage(rs.getString(8));
//				  cl.seteStatus(rs.getString(9));
//				  return cl;
//			  }
//
//			});
//
//			if ( strLst.isEmpty() ){
//			  return null;
//			}else if ( strLst.size() == 1 ) { // list contains exactly 1 element
//			  return strLst.get(0);
//			}else{  // list contains more than 1 elements
//			  //your wish, you can either throw the exception or return 1st element.    
//			}
//		
//		
	

		      List<EmployeeClass> userInfoList = jdbctemplate.query(sql, new Object[] {name },
		              new RowMapper<EmployeeClass>() {
		                  public EmployeeClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		                     EmployeeClass  cla=new EmployeeClass();
		                     cla.setEid(rs.getInt(1));
		                     cla.seteName(rs.getString(2));
		                     cla.seteEmail(rs.getString(3));
		                     cla.setePassword(rs.getString(4));
		                     cla.seteMobile(rs.getString(5));
		                     cla.seteAddress(rs.getString(6));
		                     cla.setReferalCode(rs.getString(7));
		                     cla.seteImage(rs.getString(8));
		                     cla.seteStatus(rs.getString(9));
		                     return cla;
		                  }
		              });

		      if (userInfoList.isEmpty()) {
		          return null;
		      } else {
		          return userInfoList.get(0);
		      }
		  }

	public List<ReferralMechanism> getAllReferalMechanismData(String refaral) {

String sql="select * from ReferralMechanism   where referralCode=? ";
	

List<ReferralMechanism> list=jdbctemplate.query(sql, new Object[] {refaral},  new RowMapper<ReferralMechanism>() {
    public ReferralMechanism mapRow(ResultSet rs, int rowNum) throws SQLException {
       
    	ReferralMechanism  rem=new ReferralMechanism();
    	rem.setRid(rs.getInt(1));
    	rem.setReferralCode(rs.getString(2));
    	rem.setEmailId(rs.getString(3));
    	rem.setCategory(rs.getString(4));
    	rem.setReferralMechanismDate(rs.getDate(5));
        return rem;
     }
 });
return list;
		
	
		
	}

	public ReferralForNB getAllReferralForNBData(String referal) {

String sql="select * from ReferralForNB   where referralCode=?";
  List<ReferralForNB>   list= jdbctemplate.query(sql, new Object[] {referal}, new RowMapper<ReferralForNB>() {
    public ReferralForNB mapRow(ResultSet rs, int rowNum) throws SQLException {
       
    	ReferralForNB  nb=new ReferralForNB();
    
    	nb.setAmount(rs.getInt(3));
    	nb.setData_collected(rs.getInt(4));
        return nb;
     }
 });
  if (list.isEmpty()) {
	    return null;
	} else {
	    return list.get(0);
	}
	}

	public ReferralForNC getAllReferralForNC(String referal) {
String sql="select * from ReferralForNC  where referralCode=?";
List<ReferralForNC> list=jdbctemplate.query(sql, new Object[] {referal},  new RowMapper<ReferralForNC>() {
    public ReferralForNC mapRow(ResultSet rs, int rowNum) throws SQLException {
    	ReferralForNC  nc=new ReferralForNC();

nc.setAmount(rs.getInt(3));
  nc.setData_collected(rs.getInt(4));     
return nc;
     }
 });
if (list.isEmpty()) {
    return null;
} else {
    return list.get(0);
}
	}

	public List<DealsCollection> getAllDealsCollectionData(String email) {
String sql="select * from DealsCollection  where empEmailId=?";
List<DealsCollection> list=jdbctemplate.query(sql, new Object[] {email},  new RowMapper<DealsCollection>() {
    public DealsCollection mapRow(ResultSet rs, int rowNum) throws SQLException {
    	DealsCollection  dc=new DealsCollection();   
    
    	dc.setDealAmount(rs.getInt(3));
    	dc.setAmount(rs.getInt(4));
    	dc.setTotalCollect(rs.getInt(5));
return dc;
     }
 });
//if (list.isEmpty()) {
//    return null;
//} else {
//    return list.get(0);
//}
return list;
	}

	public List<VendorRegister> getAllDataVendorRegister(String email) {

String sql="select * from VendorRegister  where empMember=?";
		
List<VendorRegister> list=jdbctemplate.query(sql, new Object[] {email},  new RowMapper<VendorRegister>() {
    public VendorRegister mapRow(ResultSet rs, int rowNum) throws SQLException {
    	
    	VendorRegister  vr=new VendorRegister();
    	vr.setOid(rs.getInt(1));
    	vr.setOwnerName(rs.getString(2));
    	vr.setOwnerEmail(rs.getString(3));
    	vr.setOwnerMobile(rs.getString(4));
    	vr.setInchrgName(rs.getString(5));
    	vr.setInchrgEmail(rs.getString(6));
    	vr.setInchrgMobile(rs.getString(7));
    	vr.setoEmail(rs.getString(8));
    	vr.setoPassword(rs.getString(9));
    	vr.setoImage(rs.getString(10));
    	vr.setShopAddress(rs.getString(11));
    	vr.setShopContactNumber(rs.getString(12));
    	vr.setoCategory(rs.getString(13));
    	vr.setShopName(rs.getString(14));
    	vr.setShopEmail(rs.getString(15));
    	vr.setoPaid(rs.getString(16));
    	vr.setToken(rs.getString(17));
    	vr.setEmpMember(rs.getString(18));
    	vr.setDateVisit(rs.getString(19));
    	vr.setAmount(rs.getString(20));
    	vr.setShopWebSite(rs.getString(21));
    	vr.setShopOpenTime(rs.getString(22));
    	vr.setShopCloseTime(rs.getString(23));
    	vr.setShopImage(rs.getString(24));
return vr;
     }
 });
return list;


	}

	
	
	
	public Vendor_details getAllVendor_details(String name) {

String sql="select * from Vendor_details  where user_name=?";


List<Vendor_details> list=jdbctemplate.query(sql, new Object[] {name},  new RowMapper<Vendor_details>() {
public Vendor_details mapRow(ResultSet rs, int rowNum) throws SQLException {
	Vendor_details  vd=new Vendor_details();
	vd.setId(rs.getInt(1));
	vd.setUser_name(rs.getString(2));
	vd.setLandline(rs.getString(3));
	vd.setWhatsapp(rs.getInt(4));
	vd.setYrsofexp(rs.getInt(5));
	vd.setSocialmedia(rs.getString(6));
	vd.setEducation(rs.getString(7));
	vd.setExperience(rs.getString(8));
vd.setAwards(rs.getString(9));
vd.setAchievements(rs.getString(10));
	return vd;
}
});
if (list.isEmpty()) {
return null;
} else {
return list.get(0);
}
	}

	
	
public int getCountfromReferal(String referalId, String category, String stDate, String EDate) {
		
Object args[]= {referalId,category,stDate,EDate};		
		
String sql="select count(*) from  ReferralMechanism    where referralCode=? AND category=? AND    ReferralMechanismDate  between ? AND ? ";
		
int count = jdbctemplate.queryForObject(sql, args, Integer.class);



//if (count > 0) {
//	count = true;
//}

		System.out.println(count);
		return count;
	}

public boolean updateEmployee(EmployeeClass empcl) {

	
Object  args[]= {empcl.geteName(),empcl.geteMobile(),empcl.geteAddress(),empcl.getReferalCode(),empcl.geteImage(),empcl.geteEmail(),empcl.getePassword()};
	
String sql="update Employees   set eName=?, eMobile=?,eAddress=?,ReferalCode=?,eImage=? where  	eEmail=? && ePassword=? ";
  int id=jdbctemplate.update(sql, args);

  

if(id==0) {
	return false;
}else {
	return true;
}

}

public int deleteEmployee(String empemail) {
String sql="delete  from  Employees  where eEmail=?";

Object args[]= {empemail};

 int   id=jdbctemplate.update(sql, args);
	return id;
}

public int IsExist(String email, String password) {
Object args[]= {email,password};
String sql="select count(*) from Employees   where eEmail=? && ePassword=?";
int count = jdbctemplate.queryForObject(sql, args, Integer.class);
	return count;
}
	







	}

