package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.LoginModel;

public interface LoginService {
	List<LoginModel> findByUsername(LoginModel loginModel);
}
