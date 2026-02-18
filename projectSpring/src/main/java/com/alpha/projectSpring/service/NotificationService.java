package com.alpha.projectSpring.service;

     import java.time.LocalDateTime;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alpha.projectSpring.entity.Email;
	import com.alpha.projectSpring.entity.Sms;
	import com.alpha.projectSpring.entity.Whatsapp;

import com.alpha.projectSpring.repository.Emailrepository;
	import com.alpha.projectSpring.repository.Smsrepository;
	import com.alpha.projectSpring.repository.Whatapprepository;

	@Service
	@Transactional
	public class NotificationService {

	    @Autowired
	    private Emailrepository emailRepository;

	    @Autowired
	    private Smsrepository smsRepository;

	    @Autowired
	    private Whatapprepository Whatapprepository;

	    // -------- EMAIL --------
	    public Email saveEmail(String emailTo) {
	        Email email = new Email();
	        email.setEmailsentto(emailTo);
	        email.setSentOn(LocalDateTime.now());
	        return emailRepository.save(email);
	       
	    }


	        
	        
	    public List<Email> getAllEmails() {
	        return emailRepository.findAll();
	    }

	    // -------- SMS --------
	    public Sms saveSms(long mobileNumber, String message) {
	        Sms sms = new Sms();
	        sms.setMobilenumber(mobileNumber);
	        sms.setMessagesent(message);
	        sms.setSentOn(LocalDateTime.now());
	        return smsRepository.save(sms);
	    }

	    public List<Sms> getAllSms() {
	        return smsRepository.findAll();
	    }

	  
	    public Whatsapp saveWhatsapp(long mobileNumber, String message) {
	        Whatsapp whatsapp = new Whatsapp();
	        whatsapp.setMobilenumber(mobileNumber);
	        whatsapp.setMessagesent(message);
	        whatsapp.setSenton(LocalDateTime.now());
	        return Whatapprepository.save(whatsapp);
	    }

	 

		public List<Whatsapp> getWhatsapp() {
			// TODO Auto-generated method stub
			 return Whatapprepository.findAll();
		}
	}


