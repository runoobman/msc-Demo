package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigStartSpringCloudApp3344
{
	public static void main(String[] args) {

		SpringApplication.run(ConfigStartSpringCloudApp3344.class, args);
	}
}
