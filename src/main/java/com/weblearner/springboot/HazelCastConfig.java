package com.weblearner.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;


@Configuration
public class HazelCastConfig {

	@Bean
	public Config hazelConfig() {
		Config config = new Config();
		config.setInstanceName("myhazelcast");		
		return config;
	}
}
