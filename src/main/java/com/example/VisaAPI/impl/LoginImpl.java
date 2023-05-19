package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.LoginMapper;
import com.example.VisaAPI.model.LoginModel;
import com.example.VisaAPI.service.LoginService;
@Service
public class LoginImpl implements LoginService{
	@Resource
	LoginMapper mapper;
	@Override
	public List<LoginModel> findByUsername(LoginModel loginModel) {
		return mapper.findByUsername(loginModel);
	}
}
