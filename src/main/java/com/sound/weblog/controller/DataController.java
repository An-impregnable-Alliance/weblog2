package com.sound.weblog.controller;

import com.sound.weblog.entity.TestUser;
import com.sound.weblog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private TestService testService;

    @RequestMapping("/getByName")
    public String getByName(String name){
        return "hi ,welcome to " + name;
    }


    @RequestMapping("/sel/{id}")
    public String sel(@PathVariable int id){
        System.out.println(id);
        TestUser sel = testService.Sel(id);
        return "hi ,welcome to " + sel.getName();
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
