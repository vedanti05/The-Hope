package com.symbiosis.hope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.symbiosis.hope.model.Appointment;
import com.symbiosis.hope.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService aps;
	
	@GetMapping("/appointment")
	public List<Appointment> handleget()
	{
		return aps.getAll();
	}

	@PostMapping("/addappointment")
	public Appointment add(@RequestBody Appointment r)
	{
		return aps.insertrecord(r);
	}

	@DeleteMapping("/delappointment/{apid}")
	public void delr(@PathVariable("apid") int r )
	{
		aps.del(r);
	}

	@PutMapping("/upappointment/{apid}")
	public Appointment update(@PathVariable("apid")int i,@RequestBody Appointment r)
	{
		return aps.updaterecord(i, r);
	}

	@GetMapping("/appointment/{username}/{emailid}")
	public List<Appointment> login(@PathVariable("username")String username,@PathVariable("emailid")String emailid)
	{
		return aps.appointment(username, emailid);
	}
	}



