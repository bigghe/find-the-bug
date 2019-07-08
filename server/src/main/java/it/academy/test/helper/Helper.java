package it.academy.test.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.academy.test.model.Beer;
import it.academy.test.model.Brewery;
import it.academy.test.repository.BeerRepository;
import it.academy.test.repository.BreweryRepository;

@Component
public class Helper {

	@Autowired
    private BreweryRepository repositoryBrewery;

	@Autowired
    private BeerRepository repositoryBeers;
	
    public Helper() {
    }
    
    public List<Beer> findAllBeers() {
    	
    	return repositoryBeers.findAll();
    }

	public Beer findBeerById(Long idBeer) {
		
		return repositoryBeers.findByDescription(idBeer.toString());
	}
	
	public List<Brewery> findAllBrewery() {

		return repositoryBrewery.findAll();
	}

	public Brewery findBreweryById(Long idBrewery) {
		
		return repositoryBrewery.findById(idBrewery);
	}

	public List<Beer> findBeersListByBreweryId(Long idBrewery) {
		
    	//TODO implementare ricerca lista birre con l'idBrewery in input
    	return repositoryBeers.findAll();
	}
}
