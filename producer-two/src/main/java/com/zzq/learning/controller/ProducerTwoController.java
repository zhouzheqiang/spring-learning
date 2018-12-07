package com.zzq.learning.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerTwoController {
    @GetMapping
    public String producer(@RequestParam(name = "name") String name) {
        return "this is two, name:" + name;
    }
}
