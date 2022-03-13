package com.email.api.service;

import java.util.Map;

public interface Notification {
    MailResponse notification(MailRequest request, Map<String, Object> model);
}
