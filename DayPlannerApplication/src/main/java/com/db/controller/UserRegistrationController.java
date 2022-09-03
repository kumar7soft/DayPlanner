package com.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.domain.UserDetailsVO;
import com.db.service.UserRegistrationService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService service;
	
	@GetMapping("/isUserExists")
	public ResponseEntity<List<UserDetailsVO>> isUserExists(@RequestParam String phoneNumber){
		
		return ResponseEntity.ok(service.isUserExists(phoneNumber));
	}
	
	
	@PostMapping("/userRegistration")
	public ResponseEntity<Boolean> registerUser(@RequestBody UserDetailsVO userDetailsVO ){
		
		return ResponseEntity.ok(service.userRegistration(userDetailsVO));
	}

}
