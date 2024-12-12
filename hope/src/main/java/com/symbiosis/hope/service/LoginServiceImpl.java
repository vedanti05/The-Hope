package com.symbiosis.hope.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.symbiosis.hope.model.Login;
import com.symbiosis.hope.repository.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	@Qualifier ("logRepo")
	private LoginRepository logRepo;

	@Override
	public Login insertrecord(Login r) {
		// TODO Auto-generated method stub
		return logRepo.save(r);
	}

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return logRepo.findAll();
	}

	@Override
	public void del(String ri) {
		// TODO Auto-generated method stub
		logRepo.deleteById(ri);
	}

	@Override
	public Login updaterecord(String i, Login r) {
		Optional<Login> opt=logRepo.findById(i);
		if(opt.isPresent())
		{
			Login rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setPassword(r.getPassword());
			return logRepo.save(rold);
		}
		return null;
	}

	@Override
	public List<Login> login(String emailid, String password) {
		// TODO Auto-generated method stub
		return logRepo.findAllByusernameAndPassword(emailid, password);
	}
}
	

	
