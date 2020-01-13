package com.myspringmvc.controller;

import com.myspringmvc.service.MyService;
import com.springframework.annotaion.Autowired;
import com.springframework.annotaion.Controller;
import com.springframework.annotaion.RequestMapping;
import com.springframework.annotaion.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hello")
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping("/info")
    public String hello2(@RequestParam("ok") String ok){
        return myService.hello(ok);
    }

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response,@RequestParam("name") String name){
        return myService.hello(name);
    }
}
