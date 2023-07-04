package com.devil.order.controller;

import com.devil.feign.client.OrderClient;
import com.devil.order.config.MyNacosProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements OrderClient{

    @Autowired
    private MyNacosProperties myNacosProperties;

    @RequestMapping("order")
    public String order() {
        System.out.println("run");
        return "this is order service " + myNacosProperties.getName() + " " + myNacosProperties.getPassword();
    }

    @GetMapping("/feignOrder/{id}")
    public String feignOrder(@PathVariable("id") String id) {
        return id + " is right !";
    }
}
