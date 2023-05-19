package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.UserDeleteModel;
import com.example.VisaAPI.model.UserModel;

public interface UserDeleteService {
	int DeleteByUsernameRole(UserDeleteModel userDeleteModel);
	int DeleteByUsernameUser(UserDeleteModel userDeleteModel);
	List<UserDeleteModel> CheckRoleLoginUser(UserDeleteModel userDeleteModel);
	List<UserDeleteModel> CheckDeleteByUsername(UserDeleteModel userDeleteModel);
	List<UserModel> SelectDeleteByUsername(UserModel userModel);

}
