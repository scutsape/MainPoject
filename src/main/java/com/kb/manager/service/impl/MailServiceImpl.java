package com.kb.manager.service.impl;

import com.kb.manager.entity.Employee;
import com.kb.manager.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void sendEmail(Employee employee) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        try {

            helper.setFrom("huligan061@gmail.com");
            helper.setTo(employee.getEmail());
            helper.setText("Hello"+ employee.getFirstName()+ employee.getLastName()+"Your password is"+ employee.getPassword(),true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }
}
