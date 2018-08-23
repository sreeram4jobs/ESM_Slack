package com.nano.pro.dealsamount;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DAODealInterface {


public List<DealCount>  getDataByEmail(String name);	
	

public List<ReferralForNB>  getDataByReferalCode(String name);


public List<ReferralForNC>  getDataByReferalReferralForNC(String name);
}
