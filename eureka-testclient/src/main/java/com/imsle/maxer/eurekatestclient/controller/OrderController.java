package com.imsle.maxer.eurekatestclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/findOrder")
    @HystrixCommand(fallbackMethod = "backMet")
    public String findOrder(){
        return this.restTemplate.getForObject("http://order/order",String.class);
    }

    public String backMet(){
        return "当前服务不可用,请联系管理员进行修复";
    }
}
