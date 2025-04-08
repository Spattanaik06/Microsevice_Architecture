package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakerController 
{
	@GetMapping("/get")
	@CircuitBreaker(name = "CrcuitBreaker_Resilance4j",fallbackMethod ="getMySqlDb" )
	public String getRadisDB()
	{
		int i=10/0;
		
		System.out.println("comes from mySql redis");
		return "Comes from Redis DataBase";
	}
	
	public String getMySqlDb(Throwable t)
	{
		System.out.println("comes from mySql DB"+t.getMessage());
		return "comes from MY SQl Db";
	}
}
