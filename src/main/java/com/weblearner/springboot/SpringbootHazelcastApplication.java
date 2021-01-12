package com.weblearner.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

@SpringBootApplication
@EnableCaching
public class SpringbootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHazelcastApplication.class, args);
	}
}
