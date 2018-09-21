package com.springboot.wsh.sender;

import com.springboot.wsh.constants.Constants;
import com.springboot.wsh.entity.Member;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title: MemberRegisterSender
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 用户注册消息发送者
 * @Author WeiShiHuai
 * @Date 2018/9/21 15:33
 */
@Component
public class MemberRegisterSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送会员注册通知消息
     *
     * @param message 消息内容
     */
    public void sendMessage(Member message) throws Exception {
        rabbitTemplate.convertAndSend(Constants.MEMBER_TOPIC_EXCHANGE_NAME, Constants.MEMBER_TOPIC_EXCHANGE_ROUTE_KEY, message);
    }

}
