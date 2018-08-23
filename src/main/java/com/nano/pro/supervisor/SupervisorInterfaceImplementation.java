package com.nano.pro.supervisor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.nano.pro.category.CategoryRowMapper;
import com.nano.pro.category.NanoCartSubCategory;
import com.nano.pro.employee.EmployeeClass;

@Service
public class SupervisorInterfaceImplementation implements  SupervisorInterface{

@Autowired	
public JdbcTemplate  jdbctemplate;

public Supervisor getdatasupervisor(String email) {
	
String sql="select * from Supervisor  where emailSupervisor=?  ";
List<Supervisor> userInfoList = jdbctemplate.query(sql, new Object[] {email },
        new RowMapper<Supervisor>() {
            public Supervisor mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Supervisor  cla=new Supervisor();
              cla.setSupervisorid(rs.getInt(1));
              cla.setSupervisorName(rs.getString(2));
              cla.setSupervisorEmail(rs.getString(3));
              cla.setSupervisorPassword(rs.getString(4));
              cla.setSupervisorPinNumber(rs.getString(5));
              cla.setSupervisor3DigitCode(rs.getString(6));
              cla.setSupervisorNumber(rs.getInt(7));
              cla.setSupervisorBankAccount(rs.getString(8));
              cla.setSupervisorField(rs.getString(9));
              cla.setSupervisorNonRefundbleDeposite(rs.getString(10));
              cla.setSupervisorTemparary_Perminent(rs.getString(11));
              cla.setSupervisorDateOfIssue(rs.getString(12));
              cla.setSupervisorAaDharCardNumber(rs.getString(13));
               return cla;
            }
        });

if (userInfoList.isEmpty()) {
    return null;
} else {
    return userInfoList.get(0);
}

}

public int updateSupervisor(Supervisor sup) {
	Object args[]= {sup.getSupervisorName(),sup.getSupervisorEmail(),sup.getSupervisorPassword(),sup.getSupervisorPinNumber(),sup.getSupervisor3DigitCode(),sup.getSupervisorNumber(),sup.getSupervisorBankAccount(),sup.getSupervisorField(),sup.getSupervisorNonRefundbleDeposite(),sup.getSupervisorTemparary_Perminent(),sup.getSupervisorDateOfIssue(),sup.getSupervisorAaDharCardNumber()};
String sql="update Supervisor	 set supervisorName=?,supervisorPinNumber=?,supervisor3DigitCode=?,supervisorNumber=?,supervisorBankAccount=?,supervisorField=?,supervisorNonRefundbleDeposite;=?,supervisorTemparary_Perminent=?,supervisorDateOfIssue=?,supervisorAaDharCardNumber=?   where supervisorEmail=?";
int   id=jdbctemplate.update(sql, args, Integer.class);
	return id;
}


public int DeleteSupervisor(String email) {

String sql="delete    from Supervisor  where supervisorEmail=?";
Object  args[]= {email};
int id=jdbctemplate.update(sql, args, Integer.class);

	return id;
}

public int getcountUndersupervisor(String supemail) {

String sql="select count(*)   from UnderSupervisor  where SupervisorEmail=?";
	Object args[]= {supemail};
int count = jdbctemplate.queryForObject(sql, args, Integer.class);

	return count;
}



public List<UnderSupervisor> getAllUnderSupervisor(String supervisoemail) {
	Object  args[]= {supervisoemail};
String sql="select  *  from UnderSupervisor  where SupervisorEmail=?";
List<UnderSupervisor> underList = jdbctemplate.query(sql, new Object[] {supervisoemail },
        new RowMapper<UnderSupervisor>() {
            public UnderSupervisor mapRow(ResultSet rs, int rowNum) throws SQLException {
            	UnderSupervisor  uls=new UnderSupervisor();
            	uls.setUndersuperId(rs.getInt(1));
            	uls.setUnderSupervisorEmploemail(rs.getString(2));
            	uls.setSupervisorEmail(rs.getString(3));
            	uls.setUnderSupervisorEmploName(rs.getString(4));
               return uls;
            }
        });

return underList;
}





	
}
