package com.symbiosis.hope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.hope.model.Contactus;
import com.symbiosis.hope.service.ContactusService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/contactus")

public class ContactusController {
@Autowired
private ContactusService cs;

@GetMapping("/contactus")
public List<Contactus> handleget()
{
	return cs.getAll();
}

@PostMapping("/addcon")
public Contactus add(@RequestBody Contactus r)
{
	return cs.insertrecord(r);
}

@DeleteMapping("/delcon/{id}")
public void delr(@PathVariable("id") int r )
{
	cs.del(r);
}

@PutMapping("/upcon/{id}")
public Contactus update(@PathVariable("id")int i,@RequestBody Contactus r)
{
	return cs.updaterecord(i, r);
}


@GetMapping("/contactus/login/{emailid}/{password}")
public List<Contactus> login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
{
	return cs.login(emailid, password);
}

}
