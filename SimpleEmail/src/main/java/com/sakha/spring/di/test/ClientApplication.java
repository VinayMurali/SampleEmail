package com.sakha.spring.di.test;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sakha.spring.di.configuration.DIConfiguration;
import com.sakha.spring.di.consumer.MyApplication;

public class ClientApplication{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		app.processMessage("Hello","rama@gmail.com");
		context.close();
	}

}