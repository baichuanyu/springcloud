package com.bcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author baichuanyu
 * @date 2020/7/11
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderApplcation {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplcation.class);
    }
}
