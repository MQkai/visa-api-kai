package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.RegisterModel;



public interface RegisterService {

	int saveUser(RegisterModel registerModel);
	int saveRoles(RegisterModel registerModel);

	List<RegisterModel> getuser (RegisterModel registerModel);
	
}
