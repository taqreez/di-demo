package com.taqy.learning.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en", "default"})
@Service
@Primary
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String greet() {
        return "Hello from Primary Host";
    }
}
