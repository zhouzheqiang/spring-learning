package com.zzq.learning.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzq.learning.api.ConsumerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private ConsumerApi consumerApi;

    @GetMapping
    public String consumer(@RequestParam String name) {
        return consumerApi.hello(name);
    }

    @HystrixCommand(fallbackMethod = "getDefaultString")
    @GetMapping("/turbineTest")
    public String turbineTest(@RequestParam String name) {
        return consumerApi.hello(name);
    }

    private String getDefaultString(String name) {
        return "ERROR";
    }
}
