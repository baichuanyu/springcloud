package com.bcy.controller;


import com.bcy.api.MemberApi;
import com.bcy.api.UserMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    MemberApi memberApi;

    @RequestMapping("/order")
    public UserMember order(String id){
        return memberApi.findUserById(id);
    }
}
