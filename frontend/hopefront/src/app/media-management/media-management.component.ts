import { Component, OnInit } from '@angular/core';
import { Media } from '../models/media';
import { MediaService } from '../services/media.service';
import { DomSanitizer } from '@angular/platform-browser';
import { Router } from '@angular/router';
import { FileHandle } from '../models/file-handle';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-media-management',
  imports: [FormsModule,CommonModule],
  templateUrl: './media-management.component.html',
  styleUrl: './media-management.component.css'
})
export class MediaManagementComponent implements OnInit{
  media: Media = new Media();
  submitted = false;
  errordata="";
constructor(private mediaService: MediaService,private router:Router,private sanitizer:DomSanitizer) { }

  ngOnInit()
  {

  }
  newMedia(): void {
    this.submitted = false;
  this.media = new Media();
  }

  save() {
    
    const formData=this.prepareFormData(this.media);
    this.mediaService.createMedia(formData).subscribe(data => {
      if(data!=null)
      {
        alert("Media added successfully")
      console.log(data)
      this.gotoList();
      }
    }, 
    error =>{ console.log(error);
      this.errordata=error;
     
    })
  }
  prepareFormData(media:Media):FormData{
    const formData=new FormData()
    formData.append(
      'media',
      new Blob([JSON.stringify(media)],{type:"application/json"})
    );
    for(var i=0;i<media.mediaImages.length;i++)
    {
      formData.append(
        'imageFile',
        media.mediaImages[i].file,
        media.mediaImages[i].file.name
      );
    }
    return formData;
  }
  removeImage(i:number)
  {
    this.media.mediaImages.splice(i,1)
  }
  onFileSelected(event:any){
    if(event.target.files)
    {
const file=event.target.files[0];
const fileHandle:FileHandle={
  file:file,
  url:this.sanitizer.bypassSecurityTrustUrl(window.URL.createObjectURL(file)),
  name:file.name


}
this.media.mediaImages.push(fileHandle)
    }
  }
  onSubmit() {
    this.save();    
    this.submitted = true;
    console.log("inside on submit")
  }

  gotoList() {
    this.router.navigate(['/']);
  }


}
