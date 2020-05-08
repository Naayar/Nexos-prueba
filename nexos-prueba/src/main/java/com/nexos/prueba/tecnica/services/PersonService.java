package com.nexos.prueba.tecnica.services;

import java.util.List;

import com.nexos.prueba.tecnica.repository.PersonEntity;

public interface PersonService {

	public List<PersonEntity> findAll();
	
	public PersonEntity save(PersonEntity PersonEntity);
	
	public void delete(PersonEntity PersonEntity);
	
	public PersonEntity findById(int id);

}
