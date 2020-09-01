package com.bcy.api;

import com.bcy.service.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 一个接口 添加 @FeignClient注解，
 * name 为提供服务，fallback 为 异常超时返回降级处理策略
 * 再方法上要添加请求 服务 requestMapping 注解
 * @author baichuanyu
 * @date 2020/7/10
 */
@FeignClient(name="member-service",fallback = MemberFallBack.class)
public interface MemberApi {

    @RequestMapping("/member/getUserById")
    public UserMember findUserById(@RequestParam String id);

}
