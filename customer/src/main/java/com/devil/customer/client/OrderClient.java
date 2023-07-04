package com.devil.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order")
public interface OrderClient {

    @GetMapping("/feignOrder/{id}")
    String order(@PathVariable("id") String id);
}
