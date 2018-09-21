package com.springboot.wsh.entity;

import java.io.Serializable;

/**
 * @Title: Member
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 会员实体类
 * @Author WeiShiHuai
 * @Date 2018/9/21 14:53
 */
public class Member implements Serializable {

    private Long id;
    /**
     * 用户名
     */
    private String usernmae;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
