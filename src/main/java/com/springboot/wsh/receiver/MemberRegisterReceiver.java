package com.springboot.wsh.receiver;

import com.springboot.wsh.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Title: MemberRegisterReceiver
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 用户注册消息接收者
 * @Author WeiShiHuai
 * @Date 2018/9/21 15:47
 */
@Component
@RabbitListener(queues = "rabbit_mq_member_register_queue_name")
public class MemberRegisterReceiver {


    private static Logger logger = LoggerFactory.getLogger(MemberRegisterReceiver.class);

    @RabbitHandler
    public void handler(Member member) throws Exception {
        logger.info("会员用户名: {}, 注册成功, 准备创建会员信息...", member.getUsernmae());

        //保存会员消息
        //......

    }

}
