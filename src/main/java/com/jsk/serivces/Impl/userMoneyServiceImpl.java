package com.jsk.serivces.Impl;

import com.jsk.mappers.userMoneyMapper;
import com.jsk.pojo.UserMoneyInfo;
import com.jsk.serivces.userMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * 业务层的实现类
 * @author jack
 * @date 2023/2/2 17:52
 */
@Service("userMoneyService")
public class userMoneyServiceImpl implements userMoneyService {
    /* 注入持久层*/
    @Autowired
    private userMoneyMapper userMoneyMapper;

    /* 查找用户钱的所有信息*/
    @Override
    public List<UserMoneyInfo> getAll() {
        return userMoneyMapper.findAll();
    }

    /* 通过用户名查找用户的信息*/
    public UserMoneyInfo getByName(String username){
        return userMoneyMapper.findByName(username);
    }

    @Override
    public int update(UserMoneyInfo userMoneinfo) {
        return userMoneyMapper.update(userMoneinfo);
    }

    @Override
//    @Transactional
    public int insertList(List<UserMoneyInfo> lists) {
        int num = userMoneyMapper.insertList(lists);
        return num;
    }

    @Override
    @Transactional
    public int transfuse(String sender, String payee, Double money) {
        if(sender == null || payee ==null || money<=0){
            System.out.println("转账失败");
            return 0;
        }
        UserMoneyInfo senderObject = userMoneyMapper.findByName(sender);
        if(senderObject.getMoney() < money){
            System.out.println("转账失败");
            return 0;
        }
        UserMoneyInfo payeeObject = userMoneyMapper.findByName(payee);
        senderObject.setMoney(senderObject.getMoney()-money);
        payeeObject.setMoney(payeeObject.getMoney()+money);
        userMoneyMapper.update(senderObject);
        String a=null;
        a.toString();
        userMoneyMapper.update(payeeObject);
        System.out.println("转账成功");
        return 1;
    }


}
