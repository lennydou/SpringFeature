package com.lennydou.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configuration用于标注class的, 表示User相当于一个 <beans/>的XML.
 *
 * 这个例子相当于这样一个配置文件
 * <beans>
 *   <bean id="stdUser" class="com.lennydou.bean.User"/>
 * </beans>
 */
@Configuration
public class AppConfig {

    /**
     * Bean标签是用来标注方法的, 一个@Bean标注的方法相当于 <bean/>
     */
    @Bean
    @Scope("singleton")
    public User stdUser() {
        return new User();
    }
}
