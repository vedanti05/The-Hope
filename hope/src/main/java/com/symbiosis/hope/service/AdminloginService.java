package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Adminlogin;

public interface AdminloginService {


List<Adminlogin> login(String email,String password);
}
