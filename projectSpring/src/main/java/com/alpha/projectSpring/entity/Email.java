package com.alpha.projectSpring.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Email {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String emailsentto;
	
    private LocalDateTime sentOn;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailsentto() {
		return emailsentto;
	}

	public void setEmailsentto(String emailsentto) {
		this.emailsentto = emailsentto;
	}

	public LocalDateTime getSentOn() {
		return sentOn;
	}

	public void setSentOn(LocalDateTime sentOn) {
		this.sentOn = sentOn;
	}

	public Email(int id, String emailsentto, LocalDateTime sentOn) {
		super();
		this.id = id;
		this.emailsentto = emailsentto;
		this.sentOn = sentOn;
	}

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
	

}
