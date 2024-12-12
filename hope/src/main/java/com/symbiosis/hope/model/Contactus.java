package com.symbiosis.hope.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contactus {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name,emailid,message;
public Contactus() {
	super();
	// TODO Auto-generated constructor stub
}
public Contactus(String name, String emailid, String message) {
	super();
	this.name = name;
	this.emailid = emailid;
	this.message = message;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Contactus [id=" + id + ", name=" + name + ", emailid=" + emailid + ", message=" + message + "]";
}

}
