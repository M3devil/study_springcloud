package com.devil.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order")
public interface OrderClient {

    @GetMapping("/feignOrder/{id}")
    String feignOrder(@PathVariable("id") String id);


}
