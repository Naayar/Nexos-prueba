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

import com.nexos.prueba.tecnica.repository.ProfessionEntity;
import com.nexos.prueba.tecnica.services.ProfessionService;

@RestController
@RequestMapping("/profession")
public class ProfessionController {

	@Autowired
	private ProfessionService professionService;
	
	@GetMapping("/listar")
	public List<ProfessionEntity> listar(){
		return professionService.findAll();
	}
	
	@PostMapping("/crear")
	public ProfessionEntity crear(@Valid @RequestBody ProfessionEntity professionEntity) {
		return professionService.save(professionEntity);
	} 
	
	@GetMapping("/Buscar-ciudad/{name}")
	public ProfessionEntity buscarCity(@PathVariable String name) {
		return professionService.findByName(name);
	}
	
	@PostMapping("/elimiar")
	public void eliminar(@Valid @RequestBody ProfessionEntity professionEntity) {
		professionService.delete(professionEntity);
	}
}
