package com.magelala.dao;

import com.magelala.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findById(Integer id);

    @Update("update user set username=#{username},password=#{password},name=#{name} where id=#{id}")
    void update(User user);
}
