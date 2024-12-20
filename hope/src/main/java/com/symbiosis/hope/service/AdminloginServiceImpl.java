package com.symbiosis.hope.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.hope.model.Adminlogin;
import com.symbiosis.hope.repository.AdminloginRepository;

@Service
public class AdminloginServiceImpl implements AdminloginService{
@Autowired
@Qualifier("admRepo")
private AdminloginRepository admRepo;

@Override
public List<Adminlogin> login(String email, String password) {
	// TODO Auto-generated method stub
	return admRepo.findAllByEmailAndPassword(email, password);
}


}
