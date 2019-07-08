package it.academy.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.academy.test.helper.Helper;
import it.academy.test.model.Beer;
import it.academy.test.model.Brewery;

@RestController
@CrossOrigin(origins = "*")
public class BreweryController {
	
	@Autowired
	private Helper helper;
	
    public BreweryController() {
    }
    
    @GetMapping("/brewery")
    public List<Brewery> allBrewerys(){
    	
    	return this.helper.findAllBrewery();
    }
    
    @GetMapping("/brewery/{id}")
    public Brewery breweryById( @PathVariable(name = "id") Long idBrewery){
    	
    	return this.helper.findBreweryById(idBrewery);
    }
    
    @GetMapping("/brewery/{idBrewery}/beers")
    public List<Beer> breweryBeersById( @PathVariable(name = "idBrewery") Long idBrewery){
    	
    	return this.helper.findBeersListByBreweryId(idBrewery);
    }
}