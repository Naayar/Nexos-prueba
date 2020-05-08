package com.nexos.prueba.tecnica.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.nexos.prueba.tecnica.repository.CityEntity;
import com.nexos.prueba.tecnica.repository.CityRepository;
import com.nexos.prueba.tecnica.repository.PersonEntity;
import com.nexos.prueba.tecnica.repository.PersonRepository;
import com.nexos.prueba.tecnica.repository.ProfessionEntity;
import com.nexos.prueba.tecnica.repository.ProfessionRepository;

@Service
public class PersonserviceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ProfessionRepository professionRepository;
	
	@Override
	public List<PersonEntity> findAll() {
		return (List<PersonEntity>) personRepository.findAll();
	}

	@Override
	public PersonEntity save(PersonEntity personEntity) {
		
		Optional<PersonEntity> person= this.personRepository.findById(personEntity.getPersonId());
		
		if(person.isPresent()) {
			throw new DuplicateKeyException("La persona ya existe");
		}else {
		
			Optional<CityEntity> city=this.cityRepository.findById(personEntity.getCiudadNacimientoId());
	
			if(city.isPresent()) {
				
				Optional<ProfessionEntity> profession= this.professionRepository.findById(personEntity.getProfessionId());
				
				if(profession.isPresent()) {
					personEntity.setCreated(new Date());
					return personRepository.save(personEntity);
				}else {
					throw new NullPointerException("Profesion no encontrada");
				}
				
				
			}else {
				throw new NullPointerException("Ciudad no encontrada");
			}
		}
				
		
	}

	@Override
	public void delete(PersonEntity PersonEntity) {
		try {
			personRepository.delete(PersonEntity);
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public PersonEntity findById(int id) {
		return personRepository.findById(id).orElse(null);
	}

}
