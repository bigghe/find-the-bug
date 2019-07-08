import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BeerListComponent } from './beer-list/beer-list.component';
import { BeerDetailComponent } from './beer-detail/beer-detail.component';
import { BreweryComponent } from './brewery/brewery.component';

const routes: Routes = [
  {
    path: '',
    component: BeerListComponent
  },
  {
    path: 'beer-detail/:beerID',
    component: BeerDetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
