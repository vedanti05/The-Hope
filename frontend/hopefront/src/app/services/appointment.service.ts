import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Appointment } from '../models/appointment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {
  private serverurl="http://localhost:8080/appointment"
  constructor(private http:HttpClient) { }
   saveappointment(apo:Appointment):Observable<Appointment>
      {
        return this.http.post<Appointment>(this.serverurl+"/addappointment",apo)
      }
      getallappointment():Observable<Appointment[]>
      {
        return this.http.get<Appointment[]>(this.serverurl+"/appointments")
      }
  
}
