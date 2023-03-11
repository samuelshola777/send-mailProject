package com.example.sendmailproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String sendToemail,
                          String subject,
                          String message){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("samuelshola14@gmail.com");
        mailMessage.setTo(sendToemail);
        mailMessage.setText(message);
        mailMessage.setSubject(subject);

       mailSender.send(mailMessage);
        System.out.println("mail sent succefully........");
    }

}
