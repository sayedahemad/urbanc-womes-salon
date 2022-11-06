package com.company.urban.womenssalon.service;

import java.util.List;

import com.company.urban.womenssalon.entity.WomensSalon;

public interface WomensSalonService {

	WomensSalon saveWomensSalon(WomensSalon womensSalon);
	
	WomensSalon updateWomensSalon(WomensSalon womensSalon);
	
	void deleteWomensSalon(WomensSalon womensSalon);
	
	WomensSalon finWomensSalonById(int id);
	
	List<WomensSalon> findAllWomensSalons();
}
