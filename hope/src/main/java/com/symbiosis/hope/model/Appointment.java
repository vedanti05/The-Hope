package com.symbiosis.hope.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int apid;
	private String username,emailid,contact,apdate,aptime,status;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(String username, String emailid, String contact, String apdate, String aptime, String status) {
		super();
		this.username = username;
		this.emailid = emailid;
		this.contact = contact;
		this.apdate = apdate;
		this.aptime = aptime;
		this.status = status;
	}
	public int getApid() {
		return apid;
	}
	public void setApid(int apid) {
		this.apid = apid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getApdate() {
		return apdate;
	}
	public void setApdate(String apdate) {
		this.apdate = apdate;
	}
	public String getAptime() {
		return aptime;
	}
	public void setAptime(String aptime) {
		this.aptime = aptime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Appointment [apid=" + apid + ", username=" + username + ", emailid=" + emailid + ", contact=" + contact
				+ ", apdate=" + apdate + ", aptime=" + aptime + ", status=" + status + "]";
	}
	
	

}
