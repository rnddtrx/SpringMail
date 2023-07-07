package com.example.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//! Vérifier les paramètres dans application properties
//spring.mail.host=smtp.gmail.com
//spring.mail.port=587
//spring.mail.username=votreMail
//spring.mail.password=votrePasswordDApplication
//spring.mail.properties.mail.smtp.auth=true
//spring.mail.properties.mail.smtp.starttls.enable=true

@Service
public class MailService {

	//private Environment env;
	
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	//Initialisation de l'environnement où l'application tourne
	//public MailService(Environment env) {
	//	this.env=env;
	//}
	
	
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
    }
	
}
