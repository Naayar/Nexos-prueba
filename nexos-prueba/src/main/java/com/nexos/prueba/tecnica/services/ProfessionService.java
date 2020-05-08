package com.nexos.prueba.tecnica.services;

import java.util.List;

import com.nexos.prueba.tecnica.repository.ProfessionEntity;

public interface ProfessionService {

	public List<ProfessionEntity> findAll();
	
	public ProfessionEntity save(ProfessionEntity ProfessionEntity);
	
	public void delete(ProfessionEntity ProfessionEntity);
	
	public ProfessionEntity findById(int id);
	
	public ProfessionEntity findByName(String name);
}
