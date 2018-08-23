package com.nano.pro.category;

import java.util.List;

import org.springframework.stereotype.Service;
@Service("ser")
public interface CategoryInterface {

	
public List<NanoCartSubCategory>  getAllCategory();
	
public boolean    isNanoCartSubCategoryExist(NanoCartSubCategory    sub);


public int saveNanoCartSubCategory(NanoCartSubCategory nacsu);

public  NanoCartSubCategory   findById(long id);

}
