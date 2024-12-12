package com.symbiosis.hope.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adminlogin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int adminloginid;
private String username,password;
public Adminlogin() {
	super();
	// TODO Auto-generated constructor stub
}
public Adminlogin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public int getAdminloginid() {
	return adminloginid;
}
public void setAdminloginid(int adminloginid) {
	this.adminloginid = adminloginid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Adminlogin [adminloginid=" + adminloginid + ", username=" + username + ", password=" + password + "]";
}

}
