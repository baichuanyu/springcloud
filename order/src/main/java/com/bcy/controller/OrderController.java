package com.bcy.controller;


import com.bcy.api.MemberApi;
import com.bcy.api.UserMember;
import com.bcy.service.BcyMongoService;
import com.bcy.service.OrderService;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    BcyMongoService bcyMongoService;
    @Autowired
    OrderService orderService;

    @RequestMapping("/mongo")
    public String test(){
       return  bcyMongoService.getBcyMongo();
    }

    @RequestMapping("/order")
    public UserMember order(String id){
        System.out.println("Controller Thread:"+Thread.currentThread().getName());
        return orderService.findUserById(id);
    }



}
