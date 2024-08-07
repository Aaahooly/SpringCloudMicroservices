package com.example.feignteurekaclient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client")
public interface FeignClientInterface {

    @GetMapping("/main/request")
    String getResponseEurekaClient();
}
