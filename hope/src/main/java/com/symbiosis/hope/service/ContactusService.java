package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Contactus;


public interface ContactusService {
	//for post request
	Contactus insertrecord (Contactus r);
	     //foe get request
	List<Contactus> getAll();
	     //for delete request
	void del (int ri);
	     //for put request
	Contactus updaterecord (int i,Contactus r);

	List<Contactus> login(String emailid,String password);
}
