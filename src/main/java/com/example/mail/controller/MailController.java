package com.example.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mail.service.MailService;

@RestController
public class MailController {
	
	@Autowired
	MailService mailService;
	
	//Methode du controleur à appeler
	@GetMapping("/sendMail")
	public String sendMail() {
		//Adresse du destinataie et mail via le service
		mailService.sendEmail("votreDestinataire@gmail.com", "Title", "Message");
		//le controlleur affiche "Done" dans le navigateur quand le mail est envoyé
		//Ca prend plusieurs secondes
		return "Done";
	}
	
}
