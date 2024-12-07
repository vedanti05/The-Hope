package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Feedback;


public interface FeedbackService {
	//for post request
	Feedback insertrecord (Feedback r);
	     //foe get request
	List<Feedback> getAll();
	     //for delete request
	void del (int ri);
	     //for put request
	Feedback updaterecord (int i,Feedback r);
}
