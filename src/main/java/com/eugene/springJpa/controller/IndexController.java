package com.eugene.springJpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {


    @RequestMapping("/test")
    public String test(){
        System.out.println("AAA");
        return "test";
    }

}
