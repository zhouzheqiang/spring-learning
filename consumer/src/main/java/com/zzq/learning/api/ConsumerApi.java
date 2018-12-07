package com.zzq.learning.api;

import com.zzq.learning.api.impl.ConsumerApiImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * zhouzheqiang
 * 2018/12/7
 */
@FeignClient(value = "producer", fallback = ConsumerApiImpl.class)
public interface ConsumerApi {
    @RequestMapping(value = "/producer", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
