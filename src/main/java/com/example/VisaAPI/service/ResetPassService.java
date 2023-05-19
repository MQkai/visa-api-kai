package com.example.VisaAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.model.ResetPassModel;



@Service
public interface ResetPassService {
	List<ResetPassModel>  selectuser(ResetPassModel resetPassModel);
	int resetpass(ResetPassModel resetPassModel);

}
