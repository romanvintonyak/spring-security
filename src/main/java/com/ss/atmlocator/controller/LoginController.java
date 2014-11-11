package com.ss.atmlocator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by romanvintonyak on 11/11/14.
 */
@Controller
@RequestMapping(value = "/auth")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String setUp(Model model){
        return "login";
    }

    @RequestMapping(value = "/loginerror")
    public String loginFailed(){
        return "error";
    }


}