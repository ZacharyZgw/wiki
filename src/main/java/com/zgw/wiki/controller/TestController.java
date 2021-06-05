package com.zgw.wiki.controller;

import com.zgw.wiki.domain.Test;
import com.zgw.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello:Test}")
    private String Hello;
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String hello(){
        return Hello;
    }

    @RequestMapping(value = "/test/list",method = RequestMethod.GET)
    public List<Test> getAllTest(){
        return testService.list();
    }
}
