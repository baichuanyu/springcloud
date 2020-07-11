package com.bcy.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ControllerTest {

//    @Resource
//    RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "errorBack")
//    @RequestMapping("/tt1")
//    public String test(){
//        ResponseEntity<String> responseEntity =  restTemplate.getForEntity("http://CLIENT2/client2/tt1",String.class);
//        return responseEntity.getBody();
//    }
//
//    public String errorBack(){
//        return "error";
//    }
}
