package com.example.feignteurekaclient.controller;

import com.example.feignteurekaclient.util.FeignClientInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControllerDemo {

    private final FeignClientInterface feignClientInterface;


    public FeignControllerDemo(FeignClientInterface feignClientInterface) {
        this.feignClientInterface = feignClientInterface;
    }

    @GetMapping("/main")
    String getResponseEurekaClientService(){
        return feignClientInterface.getResponseEurekaClient();
    }


}
