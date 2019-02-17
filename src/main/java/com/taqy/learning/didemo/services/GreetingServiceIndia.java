package com.taqy.learning.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceIndia implements GreetingService {
    @Override
    public String greet() {
        return "Namaste, aapka swagat hai!!!";
    }
}
