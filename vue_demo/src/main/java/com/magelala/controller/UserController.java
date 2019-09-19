package com.magelala.controller;

import com.magelala.pojo.User;
import com.magelala.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName:UserController
 * @Author:Timelin
 **/
@RequestMapping("/user")
@Controller
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("findAll.do")
    public List<User> findAll(){
      return   userService.findAll();
    }

    @RequestMapping("/findById.do")
    public User findById(Integer id){
        return  userService.findById(id);
    }

    @RequestMapping("/update.do")
    public void update(@RequestBody User user){
        userService.update(user);
    }
}
