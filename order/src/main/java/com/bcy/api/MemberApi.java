package com.bcy.api;

import com.bcy.service.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baichuanyu
 * @date 2020/7/10
 */
@FeignClient(name="member-service",fallback = MemberFallBack.class)
public interface MemberApi {

    @RequestMapping("/member/getUserById")
    public UserMember findUserById(@RequestParam String id);

}
