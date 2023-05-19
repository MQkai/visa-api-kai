package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.VisaAPI.model.RegisterModel;



@Repository
@Mapper
public interface RegisterMapper {

	int saveUser(RegisterModel registerModel);
	int saveRoles(RegisterModel registerModel);

	List<RegisterModel> getuser (RegisterModel registerModel);
}
