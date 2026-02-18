package com.alpha.projectSpring.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Sms {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long mobilenumber;
	private String messagesent;
	 private LocalDateTime sentOn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getMessagesent() {
		return messagesent;
	}
	public void setMessagesent(String messagesent) {
		this.messagesent = messagesent;
	}
	public LocalDateTime getSentOn() {
		return sentOn;
	}
	public  void setSentOn(LocalDateTime sentOn) {
		this.sentOn = sentOn;
	}
	public Sms(int id, long mobilenumber, String messagesent, LocalDateTime sentOn) {
		super();
		this.id = id;
		this.mobilenumber = mobilenumber;
		this.messagesent = messagesent;
		this.sentOn = sentOn;
	}
	public Sms() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
