import { Component, OnInit } from '@angular/core';
import {Reserve} from '../models/reserve';
import {Room} from '../models/room';
import { Router } from '@angular/router';
import { ReservationsService } from '../../services/reservations.service';

@Component({
  selector: 'app-new-reservation',
  templateUrl: './new-reservation.component.html',
  styleUrls: ['./new-reservation.component.css']
})
export class NewReservationComponent implements OnInit {
  mail:string="";
  verInvitados:boolean = false;
  selectedReserve: Reserve = new Reserve();
  guests: Array<string> = new Array<string>();
  rooms: Room[] = [ 
    {id: 1, name: "Room 1", capacity:10},
    {id: 2, name: "Room 2", capacity:7},
    {id: 3, name: "Room 3", capacity:15},
    {id: 4, name: "Room 4", capacity:5},
    {id: 5, name: "Room 5", capacity:5},
    {id: 6, name: "Room 6", capacity:20},
    {id: 7, name: "Room 7", capacity:100},
  ]

  addNewReservation() {
    // this.selectedReserve.id = this.reserveArray.length+1;
    // this.reserveArray.push(this.selectedReserve);
    this.selectedReserve.init = new Date(this.selectedReserve.init).toLocaleString();
    this.selectedReserve.finish = new Date(this.selectedReserve.finish).toLocaleString();
    this.reservationService.addReservation(this.selectedReserve);
    this.selectedReserve = new Reserve();
    this.router.navigate(["/viewReservation"]);
  }

  addGuest() {
    this.selectedReserve.invite.push(this.mail);
    this.mail="";
    if(this.selectedReserve.invite.length > 0 )
      this.verInvitados = true;
    else
    this.verInvitados = false;
  }

  constructor(private router: Router,private reservationService:ReservationsService) { }

  ngOnInit() {
  }

}

