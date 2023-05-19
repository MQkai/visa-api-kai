package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.UpdateUserModel;
@Mapper
public interface UpdateUserMapper {

	List<UpdateUserModel> selectuserbyId(UpdateUserModel updateUserModel);
	int updateuser(UpdateUserModel updateUserModel);

}
