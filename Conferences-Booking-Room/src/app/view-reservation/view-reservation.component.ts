import { Component, OnInit } from '@angular/core';
import { Reserve } from '../models/reserve';
import { ReservationsService } from '../../services/reservations.service';

@Component({
  selector: 'app-view-reservation',
  templateUrl: './view-reservation.component.html',
  styleUrls: ['./view-reservation.component.css']
})
export class ViewReservationComponent implements OnInit {
  reserveArray: Reserve[];

  selectedReserve: Reserve = new Reserve();
  verDatos: boolean = false;
  
  constructor(private reservationService:ReservationsService) {
    this.reserveArray = reservationService._reservation;
   }

  ngOnInit() {
  }

}
