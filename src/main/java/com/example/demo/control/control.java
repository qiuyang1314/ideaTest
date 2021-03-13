package com.example.demo.control;


import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AutoConfigurationPackage
@RequestMapping("/hello")
public class control {

    @RequestMapping(value="/sayhello")
    public String index() {
        System.out.println("23454");
        int gg;
        return "Hello World";
    }
    public void method() {
        System.out.println("drg");
        System.out.println("drg123");
    }

    public void metho() {

        System.out.println("123");
    }

    public void add() {

        System.out.println("1aaa");
    }
}
