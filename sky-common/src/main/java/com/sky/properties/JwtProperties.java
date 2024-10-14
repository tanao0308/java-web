package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")
/*
@ConfigurationProperties(prefix = "sky.jwt") 是 Spring Boot 中用于将外部配置文件（如 application.properties 或 application.yml）
中的属性映射到 Java 类中的注解。它的作用是从配置文件中读取以 sky.jwt 为前缀的配置属性，并将其自动注入到对应的 Java 类的字段中。
 */
@Data
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
