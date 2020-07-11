package com.bcy.service;

import com.bcy.api.MemberApi;
import com.bcy.api.UserMember;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author baichuanyu
 * @date 2020/7/11
 */
@Component
public class MemberService implements MemberApi {

    private static List<UserMember> list = new ArrayList<>();
    static{
        for (int i = 0; i < 10 ; i++) {
            UserMember userMember = new UserMember();
            userMember.setAge(1*10);
            userMember.setId(i);
            userMember.setName("userName_"+i);
            list.add(userMember);
        }
    }

    @Override
    public UserMember findUserById(String id) {
        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  list.get(Integer.valueOf(id));
    }
}
