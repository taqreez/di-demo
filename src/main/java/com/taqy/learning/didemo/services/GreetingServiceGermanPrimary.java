package com.taqy.learning.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("de")
@Service
@Primary
public class GreetingServiceGermanPrimary implements GreetingService {
    @Override
    public String greet() {
        return "Primarer Grudienst";
    }
}
