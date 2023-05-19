package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.UpdateUserMapper;
import com.example.VisaAPI.model.UpdateUserModel;
import com.example.VisaAPI.service.UpdateUserService;


@Service
public class UpdateUserImpl implements UpdateUserService {
	@Resource
	UpdateUserMapper mapper;
	@Override
	public List<UpdateUserModel> selectuserbyId(UpdateUserModel updateUserModel){
		return mapper.selectuserbyId(updateUserModel);
	}
	@Override
	public int updateuser(UpdateUserModel updateUserModel) {
			return mapper.updateuser(updateUserModel);
	}
}