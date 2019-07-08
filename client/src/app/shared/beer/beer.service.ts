import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class BeerService {

  constructor(private http: HttpClient) {}

  getBeers(id?): Observable<any> {
    let observable
    if (id){
      observable = this.http.get('http://localhost:4200/api/beers/' + id);
    } else {
      observable = this.http.get('http://localhost:4200/api/beers');
    }
    return observable;
  }

  getBrewery(id: number): Observable<any> {
    return this.http.get('http://localhost:4200/api/brewery/' + id);
  }

  getBreweryBeers(breweryId: number): Observable<any> {
    return this.http.get('http://localhost:4200/api/brewery/' + breweryId + '/beers');
  }
}
