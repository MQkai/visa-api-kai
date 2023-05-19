package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.ResetPassModel;
@Mapper
public interface ResetPassMapper {

	List<ResetPassModel> selectuser(ResetPassModel resetPassModel);
	int resetpass(ResetPassModel resetPassModel);

}
