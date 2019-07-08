package it.academy.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.academy.test.model.Brewery;

@Repository
public interface BreweryRepository extends JpaRepository<Brewery, Long> {
	
	/**
	 * 
	 * @return lista di tutte le birrerie
	 */
	List<Brewery> findAll();
	
	/**
	 * 
	 * @param id della birreria
	 * @return birreria con id in input
	 */
	Brewery findById(Long id);
	
	/**
	 * 
	 * @param descrizione della birreria da selezionare
	 * @return birreria con descrizione in input
	 */
	Brewery findByDescription(String description);
}