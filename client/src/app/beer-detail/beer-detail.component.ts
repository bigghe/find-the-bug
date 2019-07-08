import { Component, OnInit } from '@angular/core';
import { BeerService } from '../shared';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-beer-detail',
  templateUrl: './beer-detail.component.html',
  styleUrls: ['./beer-detail.component.css'],
  providers: [BeerService]
})
export class BeerDetailComponent implements OnInit {

  beerDetail;

  constructor(
    private beerService: BeerService,
    private route: ActivatedRoute) { }

  ngOnInit() {
    this.getBeer();
  }

  getBeer(){
    const id = +this.route.snapshot.paramMap.get('beerID');
    this.beerService.getBeers(id).subscribe(
      data => {
        this.beerDetail = data;
      },
      error => console.log(error)
    )
  }

}
