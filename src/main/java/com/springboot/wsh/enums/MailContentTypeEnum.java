package com.springboot.wsh.enums;

/**
 * @Title: MailContentTypeEnum
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 邮件文本类型Enum
 * @Author WeiShiHuai
 * @Date 2018/9/21 22:27
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text");

    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
