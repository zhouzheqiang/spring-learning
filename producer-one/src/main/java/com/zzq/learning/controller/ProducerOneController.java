package com.zzq.learning.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerOneController {
    @GetMapping
    public String producer(@RequestParam(name = "name") String name) {
        return "this is one, name:" + name;
    }
}
