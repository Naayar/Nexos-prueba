package com.nexos.prueba.tecnica.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProfessionRepository extends CrudRepository<ProfessionEntity, Integer> {
	/***
	 * Metodo donde se realiza un query para buscar en la tabla profession por el nombre de la profesion
	 * @param name
	 * @return
	 */
	@Query(value = "SELECT * FROM NexosPrueba.profession WHERE name= :name", nativeQuery = true)
	public ProfessionEntity findByName(@Param("name") String name);
}
