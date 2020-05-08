package com.nexos.prueba.tecnica.services;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexos.prueba.tecnica.repository.CityEntity;
import com.nexos.prueba.tecnica.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	@Transactional(readOnly = true)
	public List<CityEntity> findAll() {
		return (List<CityEntity>) cityRepository.findAll();
	}

	@Override
	public CityEntity save(CityEntity cityEntity) {
		Date fechaAcutal= new Date();
		cityEntity.setCreated(fechaAcutal);
		return cityRepository.save(cityEntity);
		
	}

	@Override
	public void delete(CityEntity cityEntity) {
		try {
			cityRepository.delete(cityEntity);
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public CityEntity findById(int id) {
		return cityRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public CityEntity findByName(String name) {
		return cityRepository.findByName(name);
	}

}
