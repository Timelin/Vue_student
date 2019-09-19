package com.magelala.service;

import com.magelala.pojo.User;

import java.util.List;

/**
 * @ClassName:IUserService
 * @Author:Timelin
 **/
public interface IUserService {
    List<User> findAll();

    User findById(Integer id);

    void update(User user);

}
