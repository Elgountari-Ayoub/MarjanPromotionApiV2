package com.example.marjanpromotionapiv2test.Helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private final JavaMailSender emailSender;


    @Value("${spring.mail.username}")
    private String fromMail ;

    public EmailService(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendSimpleMessage(
      String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromMail);
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);

    }
}