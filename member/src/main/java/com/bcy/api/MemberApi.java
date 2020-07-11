package com.bcy.api;

import com.bcy.api.UserMember;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author baichuanyu
 * @date 2020/7/10
 */
public interface MemberApi {

    @RequestMapping("/getUserById")
    public UserMember findUserById(String id);

}
