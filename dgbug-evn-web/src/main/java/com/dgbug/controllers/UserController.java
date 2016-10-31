package com.dgbug.controllers;

import com.dgbug.core.jwt.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tiger on 2016-10-27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    @Token
    public String test() {
        return "tiger hellow world";
    }
}
