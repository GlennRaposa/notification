package com.email.api.service;

import freemarker.template.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AccountFollowupNotification extends NotificationService implements Notification {

    @Override
    public MailResponse notification(MailRequest request, Map<String, Object> model) {
        System.out.println("Create AccountFollowupNotification Email");
        return sendEmail(request, model);
    }
}