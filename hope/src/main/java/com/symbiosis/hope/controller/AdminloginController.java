package com.symbiosis.hope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.hope.model.Adminlogin;
import com.symbiosis.hope.service.AdminloginService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/admin/")
public class AdminloginController {
@Autowired
AdminloginService admserv;
@GetMapping("/login/{email}/{password}")
public List<Adminlogin> login(@PathVariable("email")String email,@PathVariable("password")String password)
{
	return admserv.login(email, password);
}

}
