package com.devil.uesr.controller;

import com.devil.feign.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    public RestTemplate restTemplate;

    @Value("${name}")
    private String name;

    @Value("${where}")
    private String where;

    @Autowired
    private OrderClient orderClient;

    @RequestMapping("order")
    public String order() {
        String url = "http://order/order";
        return restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("user")
    public String user(@RequestHeader("Truth") String truth) {
        return "this is user service " + name + " " + where + " :: Truth=" + truth;
    }

    @RequestMapping("feignOrder")
    public String feignOrder() {
        return orderClient.feignOrder(name);
    }

}
