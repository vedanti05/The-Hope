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

import com.symbiosis.hope.model.Login;
import com.symbiosis.hope.service.LoginService;

@RestController
public class LoginController {
@Autowired
private LoginService ls;
	
@GetMapping("/logins")
public List<Login> handleget()
{
	return ls.getAll();
}

@PostMapping("/addlog")
public Login add(@RequestBody Login r)
{
	return ls.insertrecord(r);
}
	
@DeleteMapping("/dellog/{rid}")
public void delr(@PathVariable("rid") String r )
{
	ls.del(r);
}

@PutMapping("/uplog/{rid}")
public Login update(@PathVariable("rid")String i,@RequestBody Login r)
{
	return ls.updaterecord(i, r);
}
@GetMapping("/login/{emailid}/{password}")
public List<Login> login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
{
	return ls.login(emailid, password);
}
}
