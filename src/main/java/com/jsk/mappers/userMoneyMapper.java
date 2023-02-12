package com.jsk.mappers;

import com.jsk.pojo.UserMoneyInfo;

import java.util.List;

/**
 * userMoney接口通过反射进行实现
 * @author jack
 * @date 2023/2/2 17:13
 */

public interface userMoneyMapper {
    /* 查询所有数据 */
    List<UserMoneyInfo> findAll();

    /* 通过用户名查询数据 */
    UserMoneyInfo findByName(String name);

    /* 更新用户信息 */
    int update(UserMoneyInfo userMoneyInfo);

    //插入一个list数据
    int insertList(List<UserMoneyInfo> lists);

}
