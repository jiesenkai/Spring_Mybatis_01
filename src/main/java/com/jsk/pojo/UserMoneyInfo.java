package com.jsk.pojo;
/**
 * 定义个用户钱数据的实体类
 * @author jack
 * @date 2023/2/2 17:16
 */

public class UserMoneyInfo {
    private Integer id;
    private String username;
    private Double money;

    public UserMoneyInfo() {
    }

    public UserMoneyInfo(Integer id, String username, Double money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    @Override
    public String toString() {
        return "pojo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
