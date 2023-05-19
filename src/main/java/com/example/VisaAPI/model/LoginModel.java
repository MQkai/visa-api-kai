package com.example.VisaAPI.model;

import lombok.Data;

@Data
public class LoginModel {
	private String username;
	private String password;
	private String role;
	private String status;
}
