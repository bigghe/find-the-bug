import { Component, OnInit } from '@angular/core';
import { BeerService } from '../shared';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-brewery',
  templateUrl: './brewery.component.html',
  styleUrls: ['./brewery.component.css']
})
export class BreweryComponent implements OnInit {

  brewery;
  breweryBeers;
  breweryId;

  constructor(
    private beerService: BeerService,
    private route: ActivatedRoute) { }

  ngOnInit() {

    this.breweryId = +this.route.snapshot.paramMap.get('breweryID');

    this.getBrewery();
    this.getBreweryBeers();

  }

  getBrewery(){

    this.beerService.getBrewery(this.breweryId).subscribe(
      data => {
        this.brewery = data;
      },
      error => console.log(error)
    )
  }

  getBreweryBeers(){

    this.beerService.getBreweryBeers(this.breweryId).subscribe(
      data => {
        this.breweryBeers = data;
      },
      error => console.log(error)
    )
  }

}
