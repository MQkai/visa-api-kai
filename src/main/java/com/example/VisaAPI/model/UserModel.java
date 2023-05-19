package com.example.VisaAPI.model;

import lombok.Data;

@Data
public class UserModel {
	private int id;
	private String username;
	private String visa_id;
	private String name;
	private String birthday;
	private String sex;
	private String country;
	private String address;
	private String visa_date;
	private String visa_type;
}
