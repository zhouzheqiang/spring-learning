package com.zzq.learning.api.impl;

import com.zzq.learning.api.ConsumerApi;
import org.springframework.stereotype.Component;

@Component
public class ConsumerApiImpl implements ConsumerApi {
    @Override
    public String hello(String name) {
        return "ERROR";
    }
}
