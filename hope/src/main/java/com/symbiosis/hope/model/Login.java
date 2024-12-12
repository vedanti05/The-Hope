package com.symbiosis.hope.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String emailid,password;

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

public Login(String emailid, String password) {
	super();
	this.emailid = emailid;
	this.password = password;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + "]";
}

}
