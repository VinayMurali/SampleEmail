package com.sakha.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sakha.MessageService;
//import com.sakha.spring.di.services.MessageInterface;

@Component
public class MyApplication {

	@Autowired
	public MyApplication(MessageService serv) {
		super();
		this.service = serv;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}

	@Autowired
	private MessageService service;

}
