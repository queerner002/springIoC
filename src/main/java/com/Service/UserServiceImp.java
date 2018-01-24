package com.Service;


import com.Dao.UserDao;

/**
 * Created by Administrator on 2018/1/24 0024.
 */
public class UserServiceImp implements UserService {
    private UserDao userDao;
    private String msg;

    public void setUserDaoImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void save() {
        System.out.println("业务层");
        userDao.save();
    }
}
