package it.academy.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.academy.test.helper.Helper;
import it.academy.test.model.Beer;

@RestController
@CrossOrigin(origins = "*")
public class BeerController {
	
	@Autowired
	private Helper helper;
	
    public BeerController() {
    }
    
    @GetMapping("/beers")
    public List<Beer> allBeers(){
    	
    	return this.helper.findAllBeers();
    }
    
    @GetMapping("/beers/{id}")
    public Beer beerById( @PathVariable(name = "id") Long idBeer){
    	
    	return this.helper.findBeerById(idBeer);
    }
}