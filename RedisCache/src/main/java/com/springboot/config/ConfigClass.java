package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class ConfigClass 
{
    @Bean
    JedisConnectionFactory getConfiguration()
	{
		RedisStandaloneConfiguration rsdConfiguration=new RedisStandaloneConfiguration("redis-14797.crce182.ap-south-1-1.ec2.redns.redis-cloud.com", 14797);
		rsdConfiguration.setUsername("default");
		rsdConfiguration.setPassword("Rkulzt61p7QA5FjuKMNh4huPCfLFxV7o");
		
		JedisClientConfiguration jedisClientConfiguration=JedisClientConfiguration.builder().build();
		return new JedisConnectionFactory(rsdConfiguration,jedisClientConfiguration);
	}
}
