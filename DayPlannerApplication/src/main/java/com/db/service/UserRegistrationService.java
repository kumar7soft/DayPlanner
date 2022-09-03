package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.domain.UserDetailsVO;
import com.db.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepository userRepo; 
	
	public List<UserDetailsVO> isUserExists(String phoneNumber) {
		
		List<UserDetailsVO> userDetails = userRepo.findByPhoneNumber(phoneNumber);
		
		return userDetails;
	}
	
	public Boolean userRegistration(UserDetailsVO userData) {
		
		UserDetailsVO save = userRepo.save(userData);
		if(save != null) {
			return true;
		}else {
		return false;
		}
	}

}
