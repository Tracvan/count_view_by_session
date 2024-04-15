package com.codegym.controller;

import com.codegym.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class TestController {
    @GetMapping("/test")
    public String get(@ModelAttribute("counter") Counter counter){
//        counter.increment();
        return "/index";
    }
}
