import { Component } from '@angular/core';
import {Reserve} from './models/reserve';
import {Room} from './models/room';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  reserveArray: Reserve[]= [
    {id:1, nameReservation:"hola", init:new Date(), finish: new Date(),room:"Room 2",invite:null},
    {id:2, nameReservation:"hola", init:new Date(), finish: new Date(),room:"Room 2",invite:null},
    {id:3, nameReservation:"hola", init:new Date(), finish: new Date(),room:"Room 2",invite:null},
    {id:4, nameReservation:"hola", init:new Date(), finish: new Date(),room:"Room 2",invite:null}
  ];
  selectedReserve: Reserve = new Reserve();
  rooms: Room[] = [ 
    {id: 1, name: "Room 1", capacity:10},
    {id: 2, name: "Room 2", capacity:7},
    {id: 3, name: "Room 3", capacity:15},
    {id: 4, name: "Room 4", capacity:5},
    {id: 5, name: "Room 5", capacity:5},
    {id: 6, name: "Room 6", capacity:20},
    {id: 7, name: "Room 7", capacity:100},
  ]

  add() {
    this.selectedReserve.id = this.reserveArray.length+1;
    this.reserveArray.push(this.selectedReserve);

    this.selectedReserve = new Reserve();
  }
}
