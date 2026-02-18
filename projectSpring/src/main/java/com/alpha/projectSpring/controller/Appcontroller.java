package com.alpha.projectSpring.controller;

import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.alpha.projectSpring.entity.*;
	import com.alpha.projectSpring.service.NotificationService;

	@RestController
	@RequestMapping("/api")
	public class Appcontroller {

	    @Autowired
	    private NotificationService service;

	    @PostMapping("/email")
	    public Email sendEmail(@RequestParam String emailTo) {
	    	System.out.println("Controller HIT:"+emailTo);
	        return service.saveEmail(emailTo);
	    }

	    @GetMapping("/emails")
	    public List<Email> getEmails() {
	        return service.getAllEmails();
	    }

	    @PostMapping("/sms")
	    public Sms sendSms(@RequestParam long mobile,
	                       @RequestParam String message) {
	        return service.saveSms(mobile, message);
	    }

	    @GetMapping("/sms")
	    public List<Sms> getSms() {
	        return service.getAllSms();
	    }

	    @PostMapping("/whatsapp")
	    public Whatsapp sendWhatapp(@RequestParam long mobile,
	                                 @RequestParam String message) {
	        return service.saveWhatsapp(mobile, message);
	    }

	    @GetMapping("/whatsapp")
	    public List<Whatsapp> getWhatapp() {
	        return service.getWhatsapp();
	    }
	}


