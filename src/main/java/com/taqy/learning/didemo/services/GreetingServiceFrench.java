package com.taqy.learning.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFrench implements GreetingService {
    @Override
    public String greet() {
        return "Bonjour!!!";
    }
}
