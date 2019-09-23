import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {NewReservationComponent} from './new-reservation/new-reservation.component';
import {ViewReservationComponent} from './view-reservation/view-reservation.component';


const routes: Routes = [
  { path:'', redirectTo: 'viewReservation', pathMatch: 'full'  },
  { path:'newReservation', component: NewReservationComponent },
  { path:'viewReservation',  component: ViewReservationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
