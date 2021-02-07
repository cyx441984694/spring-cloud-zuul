package com.neo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /// Performing gateway testing
//    @RequestMapping("/hello")
//    public String index() {
//        return "hello world!";
//    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }


    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello  " + name +", this is second massage";
    }
}
