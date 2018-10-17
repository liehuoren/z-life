package com.zhlzzz.adminservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "admin-test")
    public String test() {
        return "this is a admin test";
    }
}
