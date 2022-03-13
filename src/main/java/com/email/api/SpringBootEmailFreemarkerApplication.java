package com.email.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.email.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEmailFreemarkerApplication {

	@Autowired
	NotificationFactory notificationFactory;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("name", request.getTemplate());
		model.put("action", "PENDING REQUEST");
		Notification notification = notificationFactory.createNotification(request.getTemplate());
		return notification.notification(request, model);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailFreemarkerApplication.class, args);
	}
}
