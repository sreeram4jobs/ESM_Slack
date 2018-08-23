package com.nano.pro.franchise;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nano.pro.employee.EmployeeClass;
import com.nano.pro.supervisor.UnderSupervisor;
@Service
public interface FranchiseDAOInterface {

	public FranchiseClasss  getFranchiseByEmailId(String email);
	public int  updatefranchise(FranchiseClasss emc);
	public int DeleteFranchise(String email);

	//=------------------------------------
	public List<UnderFranchise> getAllDataUnderSupervisor(String email);


}
