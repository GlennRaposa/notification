package com.email.api.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AccountStatusNotification extends NotificationService implements Notification {

    @Override
    public MailResponse notification(MailRequest request, Map<String, Object> model) {
        System.out.println("Create AccountSTATUSNotification Email");
        return sendEmail(request, model);
    }
}