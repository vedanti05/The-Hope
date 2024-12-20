import { Component } from '@angular/core';
import { Contactus } from '../models/contactus';
import { FormsModule } from '@angular/forms';
import { FeedbackService } from '../services/feedback.service';
import { ContactusService } from '../services/contactus.service';

@Component({
  selector: 'app-contact-us',
  imports: [FormsModule],
  templateUrl: './contact-us.component.html',
  styleUrl: './contact-us.component.css'
})
export class ContactUsComponent {
co:Contactus=new Contactus()

constructor(private conserv:ContactusService){

}
submitdata(){
this.conserv.savecontactus(this.co).subscribe(data=>{
  if(data!=null)
    alert("Thanks for leave us a message")
})
}
}
