package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.ResetPassMapper;
import com.example.VisaAPI.model.ResetPassModel;
import com.example.VisaAPI.service.ResetPassService;


@Service
public class ResetPassImpl implements ResetPassService {
	@Resource
	ResetPassMapper mapper;
	@Override
	public List<ResetPassModel> selectuser(ResetPassModel resetPassModel){
		return mapper.selectuser(resetPassModel);
	}
	public int resetpass(ResetPassModel resetPassModel) {
		return mapper.resetpass(resetPassModel);
	}

}
