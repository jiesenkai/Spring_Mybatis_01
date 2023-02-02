package com.jsk.serivces.Impl;

import com.jsk.mappers.userMoneyMapper;
import com.jsk.pojo.UserMoneyInfo;
import com.jsk.serivces.userMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
