package com.alpha.projectSpring.repoistry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.projectSpring.entity.Sms;

public interface Smsrepoistry extends JpaRepository<Sms, Integer> {
	

}
