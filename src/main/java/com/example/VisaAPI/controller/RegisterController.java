package com.example.VisaAPI.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.RegisterModel;
import com.example.VisaAPI.service.RegisterService;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
@CrossOrigin
public class RegisterController {
	@Resource
	RegisterService registerService;
	@PostMapping("/register")
	public ResponseEntity<?> registerPost (@Validated @RequestBody  RegisterModel registerModel, BindingResult result,Model model) {
		log.info("{}", registerModel);
		if (result.hasErrors()) {
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            System.out.println(errorList);
            return ResponseEntity.ok(errorList);
        }else {
				
        	//birthdayのDATEのデータ型を変更
			String inputDate = registerModel.getBirthday();
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(inputDate);
				Date sqlDate = new Date(date.getTime());
				log.info("{}", registerModel);
//				変更したビザ期限をuserregisterModelに設定
				registerModel.setDateofbirth(sqlDate);
			} catch (Exception e) {
//				変更出来ないは登録できませんとエラー表示
	            registerModel.setInformation("birthdayが修正が必要");
	            log.info("{}", registerModel);
//				この辺はまだ分からん。
				return ResponseEntity.ok(registerModel);
			}
			//visa_dateのDATEのデータ型を変更
			
			String inputkigen = registerModel.getVisa_date();
			try {
				SimpleDateFormat sdfkigen = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date datekigen = sdfkigen.parse(inputkigen);
				Date sqlDatekigen = new Date(datekigen.getTime());
				log.info("{}", registerModel);
//				変更したビザ期限をuserregisterModelに設定
				registerModel.setVisakigen(sqlDatekigen);
			} catch (Exception e) {
//				変更出来ないは登録できませんとエラー表示
	            registerModel.setInformation("ビザ期限が修正が必要");
	            log.info("{}", registerModel);
				return ResponseEntity.ok(registerModel);
			}
			
			List<RegisterModel> user = registerService.getuser(registerModel);		
			log.info("{}", registerModel);
			if(user.size()!=0) {
	            registerModel.setInformation("存在しました");
				
	            log.info("{}", registerModel);
				log.info("{}", user);

				return ResponseEntity.ok(registerModel) ;
				
			}else {
				registerModel.setInformation("Insertできました");
				registerService.saveUser(registerModel);
				return ResponseEntity.ok(registerModel) ;
			}
			
			
		}
		


	}
}

























