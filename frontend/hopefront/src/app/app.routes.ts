import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegistrationComponent } from './registration/registration.component';
import { ConsultantComponent } from './consultant/consultant.component';
import { MediaComponent } from './media/media.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { HelplineComponent } from './helpline/helpline.component';
import { ManageConsultantComponent } from './manage-consultant/manage-consultant.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ViewRegistrationComponent } from './view-registration/view-registration.component';
import { MediaManagementComponent } from './media-management/media-management.component';
import { ViewAppointmentComponent } from './view-appointment/view-appointment.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'login',component:LoginComponent},
    {path:'adminlogin',component:AdminLoginComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'aboutus',component:AboutUsComponent},
    {path:'contactus',component:ContactUsComponent},
    {path:'registration',component:RegistrationComponent},
    {path:'consultant',component:ConsultantComponent},
    {path:'media',component:MediaComponent},
    {path:'appointment',component:AppointmentComponent},
    {path:'helpline',component:HelplineComponent},
    {path:'manageconsultant',component:ManageConsultantComponent},
    {path:'viewfeedback',component:ViewFeedbackComponent},
    {path:'viewregistration',component:ViewRegistrationComponent},
    {path:'managemedia',component:MediaManagementComponent},
    {path:'viewappointment',component:ViewAppointmentComponent}
    
];
