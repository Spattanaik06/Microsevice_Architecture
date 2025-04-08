package com.springboot.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome_controller 
{
	public String welcomeMsg()
	{
		return "Welcome To Suresh website";
	}
}
