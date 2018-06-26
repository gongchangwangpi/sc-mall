package com.zb.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(value = "com.zb.mall.mapper")
//@EnableEurekaClient
@SpringBootApplication
public class ScMallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScMallUserApplication.class, args);
	}

}
