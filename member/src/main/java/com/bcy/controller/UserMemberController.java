package com.bcy.controller;

import com.bcy.api.UserMember;
import com.bcy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baichuanyu
 * @date 2020/7/10
 */
@RestController
public class UserMemberController  {

    @Autowired
    MemberService memberService;

    @RequestMapping("/getUserById")
    public UserMember findUserById(String id) {
        return memberService.findUserById(id);
    }
}
