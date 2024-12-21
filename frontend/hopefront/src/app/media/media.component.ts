import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Media } from '../models/media';
import { MediaService } from '../services/media.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-media',
  imports: [CommonModule],
  templateUrl: './media.component.html',
  styleUrl: './media.component.css'
})
export class MediaComponent implements OnInit {
  medias:Media[]=[]
login=false
 constructor(private mediaService:MediaService,private router:Router){

 }
 getAllMedias()
 {

   this.mediaService.getAll().subscribe((response:Media[])=>{
     console.log(response)
     this.medias=response
   },
   
   (error:HttpErrorResponse)=>{
     console.log(error)
    });
 }
 ngOnInit(): void {
   this.getAllMedias()
   console.log(localStorage.getItem("emailid"))
   if(localStorage.getItem("emailid")!=null)
    this.login=true
 }


}

