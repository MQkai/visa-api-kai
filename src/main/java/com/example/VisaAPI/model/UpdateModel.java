package com.example.VisaAPI.model;

import lombok.Data;

@Data
public class UpdateModel {
	    private String username;
	    private String password;
	    private String newpassword;
	    private String confirmpassword;
}
