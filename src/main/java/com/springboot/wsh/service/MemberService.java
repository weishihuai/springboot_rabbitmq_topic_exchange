package com.springboot.wsh.service;

import com.springboot.wsh.entity.Member;
import com.springboot.wsh.sender.MemberRegisterSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title: MemberService
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 会员业务层
 * @Author WeiShiHuai
 * @Date 2018/9/21 14:57
 */
@Service
public class MemberService {

    @Autowired
    private MemberRegisterSender memberRegisterSender;

    public Long memberRegister(Member member) throws Exception {
        //会员注册
        memberRegisterSender.sendMessage(member);
        return member.getId();
    }

}
