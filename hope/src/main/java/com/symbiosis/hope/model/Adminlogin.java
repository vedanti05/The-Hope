package com.symbiosis.hope.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adminlogin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int admid;
private String email,password;

public Adminlogin() {
	super();
	// TODO Auto-generated constructor stub
}
public Adminlogin(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public int getAdmid() {
	return admid;
}
public void setAdmid(int admid) {
	this.admid = admid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Adminlogin [admid=" + admid + ", email=" + email + ", password=" + password + "]";
}
}
