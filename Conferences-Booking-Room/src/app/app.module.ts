import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewReservationComponent } from './new-reservation/new-reservation.component';
import { ViewReservationComponent } from './view-reservation/view-reservation.component';

@NgModule({
  declarations: [
    AppComponent,
    NewReservationComponent,
    ViewReservationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
