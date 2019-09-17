package com.imsle.maxer.order.controller;

import com.imsle.maxer.order.utils.ServiceInfoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/order")
    public String findOrderByUser(){
        System.err.println("查询到了该方法");
        System.out.println("当前端口号:"+ServiceInfoUtil.getPort());
        return "当前查询出了订单,并且发现臧锡洋是最帅的仔!";

    }
}
