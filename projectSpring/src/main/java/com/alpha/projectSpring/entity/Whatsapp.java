package com.alpha.projectSpring.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Whatsapp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long mobilenumber;
	private String messagesent;
	 private LocalDateTime senton;
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
	
	public LocalDateTime getSenton() {
		return senton;
	}
	public void setSenton(LocalDateTime senton) {
		this.senton = senton;
	}
	public Whatsapp(long mobilenumber, String messagesent, LocalDateTime senton) {
		super();
		this.mobilenumber = mobilenumber;
		this.messagesent = messagesent;
		this.senton = senton;
	}
	public Whatsapp() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
