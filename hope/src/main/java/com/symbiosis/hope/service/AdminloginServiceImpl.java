package com.symbiosis.hope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.hope.model.Adminlogin;
import com.symbiosis.hope.repository.AdminloginRepository;

@Service
public class AdminloginServiceImpl implements AdminloginService{
@Autowired
@Qualifier("adminRepo")
private AdminloginRepository adminRepo;

@Override
public Adminlogin insertrecord(Adminlogin r) {
	// TODO Auto-generated method stub
	return adminRepo.save(r);
}

@Override
public List<Adminlogin> getAll() {
	// TODO Auto-generated method stub
	return adminRepo.findAll();
}

@Override
public void del(int ri) {
	// TODO Auto-generated method stub
	adminRepo.deleteById(ri);
}

@Override
public Adminlogin updaterecord(int i, Adminlogin r) {
	Optional<Adminlogin> opt=adminRepo.findById(i);
	if(opt.isPresent())
	{
		Adminlogin rold=opt.get();
		rold.setUsername(r.getUsername());
		rold.setPassword(r.getPassword());
		
		return adminRepo.save(rold);
	}
	return null;
}

@Override
public List<Adminlogin> adminlogin(String username, String password) {
	// TODO Auto-generated method stub
	return adminRepo.findAllByusernameAndPassword(username, password);
}

}
