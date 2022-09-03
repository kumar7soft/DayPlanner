package com.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.domain.UserDetailsVO;

@Repository
public interface UserRegistrationRepository extends JpaRepository < UserDetailsVO,Long >  {
	
	
	List<UserDetailsVO> findByPhoneNumber(String phoneNumber);
}
