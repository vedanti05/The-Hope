package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Appointment;

public interface AppointmentService {
	//for post request
	Appointment insertrecord (Appointment r);
	     //foe get request
	List<Appointment> getAll();
	     //for delete request
	void del (int ri);
	     //for put request
	Appointment updaterecord (int i,Appointment r);

	List<Appointment> appointment(String username,String emailid);
}
