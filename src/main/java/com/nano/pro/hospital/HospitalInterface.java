package com.nano.pro.hospital;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface HospitalInterface {

	
public List<HospitalProducts>  getAllHospitalProducts();	


public List<HospitalProducts>  getAllHospitalData(String name);




public List<HospitalProducts>  getAllHospitalDataById(int id);

}
