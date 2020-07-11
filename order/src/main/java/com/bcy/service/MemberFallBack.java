package com.bcy.service;

import com.bcy.api.MemberApi;
import com.bcy.api.UserMember;
import org.springframework.stereotype.Component;

/**
 * @author baichuanyu
 * @date 2020/7/10
 */
@Component
public class MemberFallBack implements MemberApi {

    @Override
    public UserMember findUserById(String id) {
        UserMember userMember = new UserMember();
        userMember.setName("default");
        return userMember;
    }
}
