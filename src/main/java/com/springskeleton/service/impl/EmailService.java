/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.impl;

import com.springskeleton.service.IEmailService;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author krystofurr
 */
@Service("emailService")
public class EmailService implements IEmailService {
    
    @Autowired
    Session emailSession;

    @Override
    public void sendStandardMessage(String to, String from, String subject, String text) {
        //compose message  
        try {  
            MimeMessage message = new MimeMessage(emailSession);  
            message.setFrom(new InternetAddress(from)); 
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            message.setSubject(subject);  
            message.setText(text);  

            //send message  
            Transport.send(message);  

            System.out.println("message sent successfully");  

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
