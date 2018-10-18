package com.zhlzzz.adminservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service")
public interface TestService {

    @RequestMapping(value = "/user-test",method = RequestMethod.GET)
    String userTest();
}
