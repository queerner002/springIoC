package com.Dao;

/**
 * Created by Administrator on 2018/1/24 0024.
 */
public class UserDaoImp implements UserDao {
    @Override
    public void save() {
        System.out.println("持久层，保存用户");
    }
}
