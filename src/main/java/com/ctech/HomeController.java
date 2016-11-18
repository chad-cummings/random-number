package com.ctech;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/random")
    public String random() {
    	return String.valueOf(new Random().nextInt(10));
    }
}
