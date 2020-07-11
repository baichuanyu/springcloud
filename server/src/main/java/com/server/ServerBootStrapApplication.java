package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author baichuanyu
 * @date 2020/7/11
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerBootStrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerBootStrapApplication.class, args);
    }
}
