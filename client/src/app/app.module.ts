import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BeerListComponent } from './beer-list/beer-list.component';
import { BeerDetailComponent } from './beer-detail/beer-detail.component';
import { BreweryComponent } from './brewery/brewery.component';
import { BeerService } from './shared';



@NgModule({
  declarations: [
    AppComponent,
    BeerListComponent,
    BeerDetailComponent,
    BreweryComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [BeerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
