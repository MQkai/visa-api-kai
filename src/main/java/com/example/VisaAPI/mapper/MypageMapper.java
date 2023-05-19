package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.MypageModel;

@Mapper
public interface MypageMapper {
	List<MypageModel> SelectByUsername(String username);

}
