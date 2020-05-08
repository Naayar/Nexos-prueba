package com.nexos.prueba.tecnica.services;

import java.util.List;

import javax.validation.Valid;

import com.nexos.prueba.tecnica.repository.CityEntity;

public interface CityService {
	
	public List<CityEntity> findAll();
	
	public CityEntity save(CityEntity cityEntity);
	
	public void delete(CityEntity cityEntity);
	
	public CityEntity findById(int id);
	
	public CityEntity findByName(String name);
	
}
