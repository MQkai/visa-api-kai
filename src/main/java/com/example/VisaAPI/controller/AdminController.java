package com.example.VisaAPI.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.AdminModel;
import com.example.VisaAPI.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
    @Resource
     AdminService adminService;
    @PostMapping("/admin")
    public ResponseEntity<?> admin(@RequestBody AdminModel adminModel) {
    	System.out.println("ok");
    	List<AdminModel> checkRole = adminService.CheckRoleAdmin(adminModel);
    	if(checkRole.get(0).getRole().equals("ADMIN")) {
    		List<AdminModel> userList = adminService.selectAll(adminModel);
    		return ResponseEntity.ok(userList);    		
    	}else {
    		return ResponseEntity.status(400).body("権限がありません。");
    	}
    }
    @PostMapping("/admin/delete")
    public ResponseEntity<?> admindelete(@RequestBody AdminModel adminModel) {
    	System.out.println("ok");
    	List<AdminModel> checkRole = adminService.CheckRoleAdmin(adminModel);
    	if(checkRole.get(0).getRole().equals("ADMIN")) {
    		List<AdminModel> userList = adminService.selectDeleted(adminModel);
    		return ResponseEntity.ok(userList);    		
    	}else {
    		return ResponseEntity.status(400).body("権限がありません。");
    	}
    }
    @PostMapping("/admin/active")
    public ResponseEntity<?> adminactive(@RequestBody AdminModel adminModel) {
    	System.out.println("ok");
    	List<AdminModel> checkRole = adminService.CheckRoleAdmin(adminModel);
    	if(checkRole.get(0).getRole().equals("ADMIN")) {
    		List<AdminModel> userList = adminService.selectActive(adminModel);
    		return ResponseEntity.ok(userList);    		
    	}else {
    		return ResponseEntity.status(400).body("権限がありません。");
    	}
    }
    

}
