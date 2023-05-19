package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.UserDeleteModel;
import com.example.VisaAPI.model.UserModel;
@Mapper
public interface UserDeleteMapper {
	int DeleteByUsernameRole(UserDeleteModel userDeleteModel);
	int DeleteByUsernameUser(UserDeleteModel userDeleteModel);
	List<UserDeleteModel> CheckRoleLoginUser(UserDeleteModel userDeleteModel);
	List<UserDeleteModel> CheckDeleteByUsername(UserDeleteModel userDeleteModel);
	List<UserModel> SelectDeleteByUsername(UserModel userModel);
}
