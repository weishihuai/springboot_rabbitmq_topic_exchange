package com.springboot.wsh.repository;

import com.springboot.wsh.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Title: MemberRepository
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 会员服务持久层实现
 * @Author WeiShiHuai
 * @Date 2018/9/21 21:27
 */
public interface MemberRepository extends JpaRepository<Member,Long>{

}
