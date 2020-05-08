package com.nexos.prueba.tecnica.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CityRepository extends CrudRepository<CityEntity, Integer>{
	/***
	 * Metodo donde se realiza un query para buscar en la tabla city por el nombre de la ciudad
	 * @param name
	 * @return
	 */
	@Query(value = "SELECT * FROM NexosPrueba.city WHERE name= :name", nativeQuery = true)
	public CityEntity findByName(@Param("name") String name);
		
}
