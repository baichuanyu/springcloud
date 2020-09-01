package com.bcy.service;

import com.bcy.api.MemberApi;
import com.bcy.api.UserMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author baichuanyu
 * @date 2020/7/10
 */
@Component
public class OrderService  {

    @Autowired
    MemberApi memberApi;

    public UserMember findUserById(String id) {
        System.out.println("Service Thread:"+Thread.currentThread().getName());
        UserMember userMember =  memberApi.findUserById(id);
        return userMember;
    }
}
