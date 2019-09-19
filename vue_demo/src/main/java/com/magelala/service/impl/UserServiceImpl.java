package com.magelala.service.impl;

import com.magelala.dao.IUserDao;
import com.magelala.pojo.User;
import com.magelala.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName:UserServiceImpl
 * @Author:Timelin
 **/
@Service
@Transactional
public class UserServiceImpl implements IUserService {


    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
