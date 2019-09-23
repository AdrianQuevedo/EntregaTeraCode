import { Injectable } from '@angular/core';
import { Reserve } from '../app/models/reserve';

@Injectable({
  providedIn: 'root'
})
export class ReservationsService {

  public _reservation:Reserve[];
  public _viewReservation:Reserve;
  private storageKey:string="RESERVATION";
  constructor() { 
    
    this._reservation = JSON.parse(localStorage.getItem(this.storageKey));
    if(this._reservation == null){
      this._reservation = [
        {id:1, nameReservation:"Conference Java", init:new Date().toLocaleString() , finish:new Date().toLocaleString(),room:"Room 5",invite:["adrian@gmail.com","camila@gmail.com", "marta@gmail.com", "jorge@gmail.com"]},
        {id:2, nameReservation:"Conference Angular 8", init:new Date().toLocaleString(), finish: new Date().toLocaleString(),room:"Room 2",invite:["jose@gmail.com","rodrigo@gmail.com", ]},
        {id:3, nameReservation:"Conference Docker", init:new Date().toLocaleString(), finish: new Date().toLocaleString(),room:"Room 1",invite:["pamela@gmail.com"]},
        {id:4, nameReservation:"Conference", init: new Date().toLocaleString(), finish: new Date().toLocaleString(),room:"Room 3",invite:["adrian@gmail.com","camila@gmail.com", "marta@gmail.com", ]}
      ];
    }

  }

  addReservation(reservation:Reserve){
    let exist = this._reservation.find((reserv)=>{
        return reserv.id == reservation.id;
    });
    
    
    if(exist != undefined){
      this._reservation = this._reservation.filter((reserv)=>{
          return reserv.id != exist.id;
      });
      
    }
    reservation.id = this._reservation.length+1;
    this._reservation.push(reservation);
    this._viewReservation = null;
    this.saveReservation();
  }

  deleteReservation(reservation:Reserve){
    this._reservation = this._reservation.filter((reserv)=>{
      return reserv.id != reservation.id
    });    
  }

  saveReservation(){
    localStorage.setItem(this.storageKey,JSON.stringify(this._reservation));
  }

  getReservations(){
    
  }
  
}