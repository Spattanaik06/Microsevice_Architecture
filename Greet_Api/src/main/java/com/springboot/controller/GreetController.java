package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.fiegnclient.Welcomeclient;


@RestController
public class GreetController 
{
	@Autowired
	private Welcomeclient welcomeclient;
	
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		String msgString="Enjoy the Microservice Architecure";
		String invokeWelcomeMsg = welcomeclient.invokeWelcomeMsg();
		 return msgString.concat(invokeWelcomeMsg);
//		return msgString;
	}
}
