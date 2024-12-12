package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Login;


public interface LoginService {
	//for post request
	Login insertrecord (Login r);
	     //foe get request
	List<Login> getAll();
	     //for delete request
	void del (String ri);
	     //for put request
	Login updaterecord (String i,Login r);

	List<Login> login(String emailid,String password);
}
