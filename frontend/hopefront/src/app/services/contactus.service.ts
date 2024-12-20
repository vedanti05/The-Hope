import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Feedback } from '../models/feedback';
import { Observable } from 'rxjs';
import { Contactus } from '../models/contactus';

@Injectable({
  providedIn: 'root'
})
export class ContactusService {

private serverurl="http://localhost:8080/contactus"


  constructor(private http:HttpClient) { }

  savecontactus(cont:Contactus):Observable<Contactus>
      {
        return this.http.post<Contactus>(this.serverurl+"/addcon",cont)
      }
      getallcontactus():Observable<Contactus[]>
      {
        return this.http.get<Contactus[]>(this.serverurl+"/contactus")
      }
}
