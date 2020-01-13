package com.myspringmvc.service;

import com.springframework.annotaion.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String hello(String name) {
        return "hello "+name;
    }
}
