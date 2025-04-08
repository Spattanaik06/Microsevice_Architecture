package com.springboot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@RedisHash("Student_Hash")
@Data
public class student 
{
	@Id
	private Integer studentId;
	private String studentName;
	private String studentAddress;
}
