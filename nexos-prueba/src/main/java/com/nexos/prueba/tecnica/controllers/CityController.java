package com.nexos.prueba.tecnica.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.tecnica.repository.CityEntity;
import com.nexos.prueba.tecnica.services.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/listar")
	public List<CityEntity> listar(){
		return cityService.findAll();
	}
	
	@PostMapping("/crear")
	public CityEntity crear(@Valid @RequestBody CityEntity cityEntity) {
		return cityService.save(cityEntity);
	} 
	
	@GetMapping("/Buscar-ciudad/{name}")
	public CityEntity buscarCity(@PathVariable String name) {
		return cityService.findByName(name);
	}
	
	@PostMapping("/eliminar")
	public void eliminar(@Valid @RequestBody CityEntity cityEntity) {
		 cityService.delete(cityEntity);
	}
}
