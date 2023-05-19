package com.example.VisaAPI.model;



import java.sql.Date;

import lombok.Data;

@Data
public class ResetPassModel {
	private String username;
	private String visa_id;
	private String birthday;
	private Date birthdayDate;
	private String newpassword;
	private String confirmnewpass;
}
