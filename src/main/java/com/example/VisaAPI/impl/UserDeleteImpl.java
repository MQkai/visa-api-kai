package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.UserDeleteMapper;
import com.example.VisaAPI.model.UserDeleteModel;
import com.example.VisaAPI.model.UserModel;
import com.example.VisaAPI.service.UserDeleteService;

@Service
public class UserDeleteImpl implements UserDeleteService{
		@Resource
		UserDeleteMapper mapper;
		@Override
		public int  DeleteByUsernameRole(UserDeleteModel userDeleteModel){
			return mapper.DeleteByUsernameRole(userDeleteModel);
		}
		public int  DeleteByUsernameUser(UserDeleteModel userDeleteModel){
			return mapper.DeleteByUsernameUser(userDeleteModel);
		}
		public List<UserDeleteModel> CheckRoleLoginUser(UserDeleteModel userDeleteModel){
			return mapper.CheckRoleLoginUser(userDeleteModel);
		}
		public List<UserDeleteModel> CheckDeleteByUsername(UserDeleteModel userDeleteModel){
			return mapper.CheckDeleteByUsername(userDeleteModel);
		}
		public List<UserModel> SelectDeleteByUsername(UserModel userModel){
			return mapper.SelectDeleteByUsername(userModel);
		}
	
}
