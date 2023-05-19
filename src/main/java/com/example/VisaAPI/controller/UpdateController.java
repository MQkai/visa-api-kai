package com.example.VisaAPI.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.UpdateModel;
import com.example.VisaAPI.service.UpdateService;

@RestController
@CrossOrigin
public class UpdateController {

    @Resource
    private UpdateService updateService;
  
    @PostMapping("/passchange")
    public ResponseEntity<?> changePassword(@RequestBody UpdateModel updateModel) {
    	List<UpdateModel> a = updateService.selectuser(updateModel);
    	System.out.println(a.size());
    	if(a.size()!=0) {
    		if(updateModel.getNewpassword().equals(updateModel.getConfirmpassword())) {
    			int rowsUpdated = updateService.updateuser(updateModel); 
        if (rowsUpdated == 1) {
            return ResponseEntity.ok("Password updated successfully");
        } else {
            return ResponseEntity.status(400).body("Failed to update password");
        }
    		}else {
    			return ResponseEntity.status(400).body("new password and confirm password not same.");
    		}
    		
        
    	}else {
    		return ResponseEntity.status(400).body("username and password not match.");
    	}
    	
    }
}
    
