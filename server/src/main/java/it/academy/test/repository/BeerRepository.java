package it.academy.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.academy.test.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
	
	/**
	 * 
	 * @return lista di tutte le birre
	 */
	List<Beer> findAll();
	
	/**
	 * 
	 * @param id della birra da cercare
	 * @return birra con id in input
	 */
	Beer findById(Long id);
	
	/**
	 * 
	 * @param id della birreria
	 * @return lista birre
	 */
	List<Beer> findByIdBrewery(Long idBrewery);
	
	/**
	 *  
	 * @param descrizione della birra
	 * @return birra con descrizione in input
	 */
	Beer findByDescription(String description);
}