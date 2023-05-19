package com.example.VisaAPI.model;



import java.sql.Date;

import lombok.Data;

@Data
public class UpdateUserModel {
	private String username;
	private String name;
	private String first_name;
	private String last_name;
	
	private String visa_id;

	private String birthday;
	private Date dateofbirth;

	private String sex;
	private String country;
	private String address;

	private String visa_date;
	private Date visakigen;

	private String visa_type;
	private String note;
}
