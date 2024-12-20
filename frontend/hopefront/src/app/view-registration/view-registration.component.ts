import { Component, OnInit } from '@angular/core';
import { Registration } from '../models/registration';
import { RegistrationService } from '../services/registration.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-registration',
  imports: [CommonModule],
  templateUrl: './view-registration.component.html',
  styleUrl: './view-registration.component.css'
})
export class ViewRegistrationComponent implements OnInit {
  rarr:Registration[]=[]
  constructor(private rserv:RegistrationService)
  {

  }
  ngOnInit(): void {
    this.rserv.getAll().subscribe(data=>{
      if(data.length>0)
        this.rarr=data
    })
  }

}
