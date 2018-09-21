package com.springboot.wsh.controller;

import com.springboot.wsh.entity.Member;
import com.springboot.wsh.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: MemberController
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 会员控制层
 * @Author WeiShiHuai
 * @Date 2018/9/21 14:57
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/registerMember")
    public void registerMember() throws Exception {
        Member member = new Member();
        member.setId(1L);
        member.setUsernmae("weixiaohuai");
        member.setPassword("123456");
        member.setEmail("2897318264@qq.com");
        memberService.memberRegister(member);
    }

}
