package com.nano.pro.supervisor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nano.pro.category.NanoCartSubCategory;


@Service
public interface SupervisorInterface {

public Supervisor  getdatasupervisor(String email) ;


public int updateSupervisor(Supervisor  sup);
	
public int DeleteSupervisor(String email);

public int getcountUndersupervisor(String supemail);


public List<UnderSupervisor>  getAllUnderSupervisor(String supervisoemail);




}
