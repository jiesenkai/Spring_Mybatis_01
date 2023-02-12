package com.jsk.serivces;

import com.jsk.mappers.userMoneyMapper;
import com.jsk.pojo.UserMoneyInfo;

import java.util.List;

/**
 * 用户钱 业务层
 * @author jack
 * @date 2023/2/2 17:48
 */

public interface userMoneyService {
    /* 查找全部数据*/
    List<UserMoneyInfo> getAll();

    UserMoneyInfo getByName(String name);
    //更新一条数据
    int update(UserMoneyInfo userMoneinfo);

    //插入一个list数据到数据库
    int insertList(List<UserMoneyInfo> lists);

    //转钱
    int transfuse(String sender,String payee,Double money);
}
