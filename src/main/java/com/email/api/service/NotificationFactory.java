package com.email.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class NotificationFactory {

    @Autowired
    AccountFollowupNotification accountFollowupNotification;

    @Autowired
    AccountStatusNotification accountStatusNotification;

    public Notification createNotification(String notificationType)
    {
        if ("ACCOUNT_FOLLOWUP".equals(notificationType)) {
            return accountFollowupNotification;
        }
        else if ("ACCOUNT_STATUS".equals(notificationType)) {
            return accountStatusNotification;
        }
        return null;
    }
}