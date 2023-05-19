package com.example.VisaAPI.model;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class RegisterModel {
	
	
	@NotEmpty(message = "ユーザー名を入力してください")
    private String username;
	
	
	@NotEmpty(message = "パスワードを入力してください")
    private String password;
	
	
	@NotEmpty(message = "名前を入力してください")
    private String name;
	
	
//	@NotEmpty(message = "名前を入力してください")
//	private String hiragana;
	
	@NotEmpty(message = "性別を選択してください")
    private String sex;
	
	
	@NotEmpty(message = "生年月日を選択してください")
    private String birthday;
	private Date dateofbirth;
	
	
	@NotEmpty(message = "在留カード番号を入力してください")
    private String visa_ID;
	
	
	@NotEmpty(message = "ビザ期限を入力してください")
    private String visa_date;
	private Date visakigen;
	
	@NotEmpty(message = "ビザ種類を選択してください")
    private String visa_type;
    
	@NotEmpty(message = "国籍を選択してください")
    private String country;
    
	@NotEmpty(message = "住所を入力してください")
    private String address;
    
    
	private String information;
	private List<String> errorList;
    public RegisterModel() {
		
	}
	
}
