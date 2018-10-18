package com.zhlzzz.adminservice.controller;

import com.zhlzzz.adminservice.client.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "admin-test")
    public String test() {
        return "this is a monitor test";
    }

    @GetMapping(value = "user-test")
    public String userTest() {
        return testService.userTest();
    }
}
