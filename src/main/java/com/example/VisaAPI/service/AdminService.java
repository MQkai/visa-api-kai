package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.AdminModel;


	public interface AdminService {
		public List<AdminModel> selectAll(AdminModel adminModel);
		List<AdminModel> selectDeleted(AdminModel adminModel);
		List<AdminModel> selectActive(AdminModel adminModel);
		public List<AdminModel> CheckRoleAdmin(AdminModel adminModel);
	
	}
		
