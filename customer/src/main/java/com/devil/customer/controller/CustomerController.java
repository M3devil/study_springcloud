package com.devil.customer.controller;

import com.devil.customer.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private OrderClient orderClient;

    @Value("${id}")
    private String id;

    @RequestMapping("customer")
    public String customer() {
        System.out.println(id);
        return orderClient.order(id);
    }
}
