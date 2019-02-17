package com.taqy.learning.didemo.controllers;

import com.taqy.learning.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Taqy on 2019-02-17
 */

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        //System.out.println("Hello World of Dependency Injection");
        return greetingService.greet();
    }
}
