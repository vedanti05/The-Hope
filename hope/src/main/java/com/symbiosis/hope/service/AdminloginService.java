package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Adminlogin;

public interface AdminloginService {
	//for post request
Adminlogin insertrecord (Adminlogin r);
     //foe get request
List<Adminlogin> getAll();
     //for delete request
void del (int ri);
     //for put request
Adminlogin updaterecord (int i,Adminlogin r);

List<Adminlogin> adminlogin(String username,String password);
}
