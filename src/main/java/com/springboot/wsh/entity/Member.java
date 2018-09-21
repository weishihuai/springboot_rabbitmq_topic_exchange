package com.springboot.wsh.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Title: Member
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 会员实体类
 * @Author WeiShiHuai
 * @Date 2018/9/21 14:53
 */
@Entity
@Table(name = "member")
public class Member implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;
    /**
     * 密码
     */
    @Column(name = "password")
    private String password;
    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
