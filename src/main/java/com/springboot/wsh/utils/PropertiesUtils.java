package com.springboot.wsh.utils;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Title: PropertiesUtils
 * @ProjectName springboot_rabbitmq_topic_exchange
 * @Description: 工具类
 * @Author WeiShiHuai
 * @Date 2018/9/21 22:54
 */
public class PropertiesUtils {
    private final ResourceBundle resource;
    private final String fileName;

    /**
     * 构造函数实例化部分对象，获取文件资源对象
     *
     * @param fileName
     */
    public PropertiesUtils(String fileName) {
        this.fileName = fileName;
        Locale locale = new Locale("zh", "CN");
        this.resource = ResourceBundle.getBundle(this.fileName, locale);
    }

    /**
     * 根据传入的key获取对象的值
     *
     * @param key properties文件对应的key
     * @return String 解析后的对应key的值
     */
    public String getValue(String key) {
        return this.resource.getString(key);
    }

    /**
     * 获取properties文件内的所有key值
     *
     * @return
     */
    public Enumeration<String> getKeys() {
        return resource.getKeys();
    }
}
