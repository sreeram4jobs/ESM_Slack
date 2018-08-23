package com.nano.pro;



import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DAOInterface {

public List<Category> getCategorydata();
public List<NanoCartCategories>  getCategoryByCategoryName(String name);

}
