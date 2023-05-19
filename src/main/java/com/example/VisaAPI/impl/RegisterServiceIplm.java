package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.RegisterMapper;
import com.example.VisaAPI.model.RegisterModel;
import com.example.VisaAPI.service.RegisterService;



@Service
public class RegisterServiceIplm implements RegisterService {
	@Resource
	private RegisterMapper mapper;
	
	@Override
	public int saveUser(RegisterModel registerModel) {
        return mapper.saveUser(registerModel);
    }
	@Override
	public int saveRoles(RegisterModel registerModel) {
        return mapper.saveRoles(registerModel);
    }
	@Override
	public List<RegisterModel> getuser(RegisterModel registerModel) {
		return mapper.getuser(registerModel);
	}
}
