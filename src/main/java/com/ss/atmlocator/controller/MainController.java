package com.ss.atmlocator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by romanvintonyak on 11/11/14.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "/index")
    public String logigSuccess(Model model){
        return "index";
    }

}