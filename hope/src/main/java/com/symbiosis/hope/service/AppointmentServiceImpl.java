package com.symbiosis.hope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.hope.model.Appointment;
import com.symbiosis.hope.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
@Autowired
@Qualifier("appRepo")
private AppointmentRepository appRepo;

@Override
public Appointment insertrecord(Appointment r) {
	// TODO Auto-generated method stub
	return appRepo.save(r);
}

@Override
public List<Appointment> getAll() {
	// TODO Auto-generated method stub
	return appRepo.findAll();
}

@Override
public void del(int ri) {
	// TODO Auto-generated method stub
	appRepo.deleteById(ri);
}

@Override
public Appointment updaterecord(int i, Appointment r) {
	Optional<Appointment> opt=appRepo.findById(i);
	if(opt.isPresent())
	{
		Appointment rold=opt.get();
		rold.setUsername(r.getUsername());
		rold.setEmailid(r.getEmailid());
		rold.setContact(r.getContact());
		rold.setApdate(r.getApdate());
		rold.setAptime(r.getAptime());
		
		return appRepo.save(rold);
	}
	return null;
}

@Override
public List<Appointment> appointment(String username, String emailid) {
	
	return appRepo.findAllByUsernameAndEmailid(username, emailid);
}
}
