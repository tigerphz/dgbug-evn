package com.dgbug.controllers;

import com.dgbug.core.jwt.Token;
import com.dgbug.model.User;
import com.dgbug.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tiger on 2016-10-27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    @Token
    public String test() {
        return "tiger hellow world";
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable(name = "id") long id) {
        return userService.getUserById(id);
    }
}
