package com.zb.mall.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2018/7/12 0012.
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }

}
