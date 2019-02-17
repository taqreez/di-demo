package com.taqy.learning.didemo.controllers;

import com.taqy.learning.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    @Autowired
    //@Qualifier("greetingServiceFrench")
    public void setGreetingService(@Qualifier("greetingServiceFrench") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
