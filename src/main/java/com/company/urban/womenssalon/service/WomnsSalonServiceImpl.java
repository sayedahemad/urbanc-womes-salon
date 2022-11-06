package com.company.urban.womenssalon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.urban.womenssalon.entity.WomensSalon;
import com.company.urban.womenssalon.repository.WomensSalonRepository;
@Service
public class WomnsSalonServiceImpl implements WomensSalonService {

	@Autowired
	WomensSalonRepository repository;
	
	@Override
	public WomensSalon saveWomensSalon(WomensSalon womensSalon) {
		return repository.save(womensSalon);
	}

	@Override
	public WomensSalon updateWomensSalon(WomensSalon womensSalon) {
		return repository.save(womensSalon);
	}

	@Override
	public void deleteWomensSalon(WomensSalon womensSalon) {
		repository.delete(womensSalon);
	}

	@Override
	public WomensSalon finWomensSalonById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<WomensSalon> findAllWomensSalons() {
		return repository.findAll();
	}

}
