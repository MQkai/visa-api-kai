package com.example.VisaAPI.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.model.UpdateUserModel;



@Service
public interface UpdateUserService {
	List<UpdateUserModel> selectuserbyId(UpdateUserModel updateUserModel);
	int updateuser(UpdateUserModel updateUserModel);

}
