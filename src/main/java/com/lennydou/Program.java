package com.lennydou;

import com.lennydou.dao.UserDao;
import com.lennydou.service.SchoolService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"daos.xml", "services.xml", "common.xml"});
        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao);
        System.out.println(userDao.getUserId());
        System.out.println(userDao.getUserName());

        SchoolService schoolService = context.getBean("schoolService", SchoolService.class);
        System.out.println(schoolService);

    }
}
