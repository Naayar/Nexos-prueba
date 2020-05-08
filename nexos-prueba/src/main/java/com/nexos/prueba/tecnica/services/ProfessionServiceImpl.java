package com.nexos.prueba.tecnica.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexos.prueba.tecnica.repository.ProfessionEntity;
import com.nexos.prueba.tecnica.repository.ProfessionRepository;

@Service
public class ProfessionServiceImpl implements ProfessionService {

	@Autowired
	private ProfessionRepository professionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<ProfessionEntity> findAll() {
		return (List<ProfessionEntity>) professionRepository.findAll();
	}

	@Override
	public ProfessionEntity save(ProfessionEntity ProfessionEntity) {
		Date fechaAcutal= new Date();
		ProfessionEntity.setCreated(fechaAcutal);
		return professionRepository.save(ProfessionEntity);
	}

	@Override
	public void delete(ProfessionEntity ProfessionEntity) {
		try {
			professionRepository.delete(ProfessionEntity);
		}catch (Exception e) {
			throw e;
		}

	}

	@Override
	@Transactional(readOnly = true)
	public ProfessionEntity findById(int id) {
		return professionRepository.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public ProfessionEntity findByName(String name) {
		return professionRepository.findByName(name);
	}

}
