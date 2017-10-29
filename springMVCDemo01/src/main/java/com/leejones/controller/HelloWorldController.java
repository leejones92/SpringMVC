package com.leejones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2017-10-22 下午5:18
 * @description
 **/
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String test(){
        System.out.println("springMVC hello world");
        return "success";
    }

}
