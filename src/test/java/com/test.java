package com;

import com.jsk.pojo.UserMoneyInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jsk.serivces.*;

import java.util.List;

public class test {
    @Test
    public void test1(){
        ApplicationContext d=new ClassPathXmlApplicationContext("Spring.xml");
        userMoneyService userMoneyService = d.getBean("userMoneyService", userMoneyService.class);
        List<UserMoneyInfo> all = userMoneyService.getAll();
        System.out.println(all);
        System.out.println(userMoneyService.getByName("jiesenkai"));
    }
}
