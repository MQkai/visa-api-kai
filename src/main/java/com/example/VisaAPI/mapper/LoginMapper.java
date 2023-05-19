package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.LoginModel;

@Mapper
public interface LoginMapper {
	 List<LoginModel>  findByUsername(LoginModel loginModel);
}
