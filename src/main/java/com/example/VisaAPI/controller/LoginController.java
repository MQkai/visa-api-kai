package com.example.VisaAPI.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.LoginModel;
import com.example.VisaAPI.service.LoginService;
@RestController
@CrossOrigin
public class LoginController {
	@Resource
	LoginService loginService;

	 @PostMapping("/login")
	   public  ResponseEntity<LoginModel> findByUsername(@RequestBody LoginModel loginModel) {
		 //ユーザー情報をチャックします。
		 List<LoginModel> user = loginService.findByUsername(loginModel);
		 	if(user.size()>0) {
//		 		ユーザー名とパスワードが正しい
		 		loginModel.setRole(user.get(0).getRole());
		 		loginModel.setPassword("ログインできました");
		 		loginModel.setStatus("SUCCESS");
			 		return ResponseEntity.ok(loginModel);
		 	}else {
//		 		ユーザー名とパスワードが正しくない
//		 		status 設定
		 		loginModel.setStatus("DEFEATED");
				return ResponseEntity.ok(loginModel);
		 	}
	    }
}

