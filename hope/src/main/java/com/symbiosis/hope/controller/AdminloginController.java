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

import com.symbiosis.hope.model.Adminlogin;
import com.symbiosis.hope.service.AdminloginService;

@RestController
public class AdminloginController {
@Autowired
private AdminloginService as;

@GetMapping("/adminlogin")
public List<Adminlogin> handleget()
{
	return as.getAll();
}

@PostMapping("/addadmin")
public Adminlogin add(@RequestBody Adminlogin r)
{
	return as.insertrecord(r);
}

@DeleteMapping("/deladmin/{rid}")
public void delr(@PathVariable("rid") int r )
{
	as.del(r);
}

@PutMapping("/upadmin/{rid}")
public Adminlogin update(@PathVariable("rid")int i,@RequestBody Adminlogin r)
{
	return as.updaterecord(i, r);
}

@GetMapping("/adminlogin/{username}/{password}")
public List<Adminlogin> login(@PathVariable("username")String username,@PathVariable("password")String password)
{
	return as.adminlogin(username, password);
}
}
