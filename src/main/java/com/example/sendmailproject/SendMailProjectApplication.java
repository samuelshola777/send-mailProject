package com.example.sendmailproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendMailProjectApplication {
    @Autowired
    private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(SendMailProjectApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
           senderService.sendEmail("deolaaxo@gmail.com"
    ,"so this is me trying out my Email app api ",
     "and you said wen next you go home you'll bring stew for me bt looks " +
     "like you forgot ever saying it bt it's fine");

    }
}
