package com.alpha.projectSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.projectSpring.entity.Email;

public interface Emailrepository extends  JpaRepository<Email, Integer> {

}
