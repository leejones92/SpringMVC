package com.leejones92.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2017-10-22 下午10:24
 * @description 非Restful风格请求
 **/
@Controller
public class NotRestfulController {

    @RequestMapping(value = "/notRestfulReq",method = RequestMethod.POST,params = "name")
    public String getParams(String name){
        System.out.println("name:" + name);
        return null;
    }

    @RequestMapping(value = "notRestfulReq/{name}",method = RequestMethod.GET)
    public String getPathVariable(@PathVariable String name){
        System.out.println("PathVariable,name:" + name);
        return null;
    }
}
