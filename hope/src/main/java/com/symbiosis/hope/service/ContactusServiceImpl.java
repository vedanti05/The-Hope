package com.symbiosis.hope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.hope.model.Contactus;
import com.symbiosis.hope.repository.ContactusRepository;


@Service
public class ContactusServiceImpl implements ContactusService{
@Autowired
@Qualifier("conRepo")
private ContactusRepository conRepo;

@Override
public Contactus insertrecord(Contactus r) {
	// TODO Auto-generated method stub
	return conRepo.save(r);
}

@Override
public List<Contactus> getAll() {
	// TODO Auto-generated method stub
	return conRepo.findAll();
}

@Override
public void del(int ri) {
	// TODO Auto-generated method stub
	conRepo.deleteById(ri);
}

@Override
public Contactus updaterecord(int i, Contactus r) {
	Optional<Contactus> opt=conRepo.findById(i);
	if(opt.isPresent())
	{
		Contactus rold=opt.get();
		rold.setName(r.getName());
		rold.setEmailid(r.getEmailid());
		rold.setMessage(r.getMessage());
		return conRepo.save(rold);
	}
	return null;
}

@Override
public List<Contactus> login(String emailid, String password) {
	// TODO Auto-generated method stub
	return conRepo.findAllByEmailidAndPassword(emailid, password);
}


}
