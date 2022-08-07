package com.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.domain.UserDetailsVO;
import com.db.service.UserRegistrationService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService service;
	
	@GetMapping("/isUserExists")
	public ResponseEntity<List<UserDetailsVO>> isUserExists(@RequestParam String phoneNumber){
		
		return ResponseEntity.ok(service.isUserExists(phoneNumber));
	}

}
