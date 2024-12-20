import { Component } from '@angular/core';
import { Appointment } from '../models/appointment';
import { FormsModule } from '@angular/forms';
import { AppointmentService } from '../services/appointment.service';

@Component({
  selector: 'app-appointment',
  imports: [FormsModule],
  templateUrl: './appointment.component.html',
  styleUrl: './appointment.component.css'
})
export class AppointmentComponent {
ap:Appointment=new Appointment()

constructor(private apserv:AppointmentService)
{

}





submitdata(){
 this.apserv.saveappointment(this.ap).subscribe(data=>{
  if(data!=null)
    alert("Your Appointment Booked")
 })
}
}
