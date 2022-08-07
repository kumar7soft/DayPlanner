package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.domain.UserDetailsVO;
import com.db.service.PlanningService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class PlanningController {
	
	@Autowired
	PlanningService planingService;
	
	@PostMapping("/verify")
	public String validateUser(@RequestBody UserDetailsVO user ) {
		return "The given user is valid user "+user.getFirstName();
	}
	
}
