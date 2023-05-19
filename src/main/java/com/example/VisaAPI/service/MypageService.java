package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.MypageModel;

public interface MypageService {
	List<MypageModel> SelectByUsername(String username);
}
