package com.walmart.api.cupon.repository.impl;

import org.springframework.stereotype.Repository;

import com.walmart.api.cupon.entry.Cupon;
import com.walmart.api.cupon.repository.CuponRepository;

@Repository
public class CuponRepositoryImpl implements CuponRepository {

	@Override
	public Cupon save(Cupon cupon) {
		// TODO Auto-generated method stub
		System.out.println("sasing something");
		return null;
	}
	
	
}
