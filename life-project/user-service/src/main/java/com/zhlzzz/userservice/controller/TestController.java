package com.zhlzzz.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "user-test")
    public String test() {
        return "this is a user test";
    }
}
