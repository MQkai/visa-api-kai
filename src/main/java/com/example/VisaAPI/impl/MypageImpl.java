package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.MypageMapper;
import com.example.VisaAPI.model.MypageModel;
import com.example.VisaAPI.service.MypageService;
@Service
public class MypageImpl implements MypageService {
	@Resource
	MypageMapper mapper;
	@Override
	public List<MypageModel> SelectByUsername(String username){
		return mapper.SelectByUsername(username);
	}

}
