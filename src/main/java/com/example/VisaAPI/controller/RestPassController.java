package com.example.VisaAPI.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.ResetPassModel;
import com.example.VisaAPI.service.ResetPassService;

import lombok.extern.slf4j.Slf4j;


@RestController
@CrossOrigin
@Slf4j
public class RestPassController {
	@Resource
	ResetPassService resetPassService;
	@PostMapping("forgetPassword")
	public ResponseEntity<?> selectuser(@RequestBody ResetPassModel resetPassModel){
		log.info("{}", resetPassModel);
		if(resetPassModel.getNewpassword().equals(resetPassModel.getConfirmnewpass())) {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        java.util.Date utilDate = null;
	        try {
	            utilDate = sdf.parse(resetPassModel.getBirthday());
	        } catch (ParseException pass) {
	            pass.printStackTrace();
	        }
	        if (utilDate != null) {
	            Date sqlDate = new Date(utilDate.getTime());
	            resetPassModel.setBirthdayDate(sqlDate);
	        }
	        List<ResetPassModel>  checkuser = resetPassService.selectuser(resetPassModel);
	        System.out.println(checkuser);
			if(checkuser.size()>0) {
				int checkchange  = resetPassService.resetpass(resetPassModel);
				System.out.println(checkchange);
				if(checkchange==1) {
					return ResponseEntity.ok("OK");

				}
			}
			return ResponseEntity.status(400).body("DATE変更できない");
		}else {
			return ResponseEntity.status(400).body("新しいパスワードと再入力パスワードが違います");
		}

	}
}





