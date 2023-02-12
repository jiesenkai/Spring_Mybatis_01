package com;

import com.jsk.pojo.UserMoneyInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jsk.serivces.*;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test2(){
        ApplicationContext d=new ClassPathXmlApplicationContext("Spring.xml");
        userMoneyService userMoneyService = d.getBean("userMoneyService", userMoneyService.class);
        userMoneyService.transfuse("admin","jack",20.00);
    }
    @Test
    public void test1(){
        ApplicationContext d=new ClassPathXmlApplicationContext("Spring.xml");
        userMoneyService userMoneyService = d.getBean("userMoneyService", userMoneyService.class);
        List<UserMoneyInfo> lists=new ArrayList();
        lists.add(new UserMoneyInfo(null,"jack1",2000.00));
        lists.add(new UserMoneyInfo(null,"jack2",3000.00));
        lists.add(new UserMoneyInfo(null,"jack3",1000.00));
        lists.add(new UserMoneyInfo(null,"jack4",5000.00));
        lists.add(new UserMoneyInfo(null,"jack5",7000.00));
        int i = userMoneyService.insertList(lists);
        System.out.println("插入了"+i+"条记录");
    }
}
