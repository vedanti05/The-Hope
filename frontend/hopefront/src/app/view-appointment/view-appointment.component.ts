import { Component, OnInit } from '@angular/core';
import { Appointment } from '../models/appointment';
import { AppointmentService } from '../services/appointment.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-appointment',
  imports: [CommonModule],
  templateUrl: './view-appointment.component.html',
  styleUrl: './view-appointment.component.css'
})
export class ViewAppointmentComponent implements OnInit{

aparr:Appointment[]=[]

constructor(private apserv:AppointmentService)
{

}
  ngOnInit(): void {
   this.apserv.getallappointment().subscribe(data=>{
    if(data.length>0)
      this.aparr=data
   }) 

  }



}
