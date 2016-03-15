package com.lennydou.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration用于标注class的, 表示User相当于一个 <beans/>的XML.
 *
 */
@Configuration
public class AppConfig {

    /**
     * Bean标签是用来标注方法的, 一个@Bean标注的方法相当于 <bean/>
     */
    @Bean
    public User getUser() {
        return new User();
    }
}
