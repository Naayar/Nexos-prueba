package com.nexos.prueba.tecnica.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.tecnica.repository.PersonEntity;
import com.nexos.prueba.tecnica.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/listar")
	public List<PersonEntity> listar(){
		return personService.findAll();
	}
	
	@PostMapping("/crear")
	public PersonEntity crear(@Valid @RequestBody PersonEntity PersonEntity) {
		return personService.save(PersonEntity);
	}
	
	@GetMapping("/buscar-persona/{id}")
	public PersonEntity buscarPersona(int id) {
		return personService.findById(id);
	}
	
	@PostMapping("/eliminar")
	public void eliminar(@Valid @RequestBody PersonEntity PersonEntity) {
		personService.delete(PersonEntity);
	}
}
