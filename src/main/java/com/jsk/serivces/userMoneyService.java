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
}
