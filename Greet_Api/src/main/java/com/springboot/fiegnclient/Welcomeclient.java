package com.springboot.fiegnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-Api",url = "http://localhost:8082")
public interface Welcomeclient 
{
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();
}
