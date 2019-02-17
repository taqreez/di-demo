package com.taqy.learning.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("urdu")
@Service
@Primary
public class GreetingserviceUrduPrimary implements GreetingService {
    @Override
    public String greet() {
        return "Khushamdeed!!!";
    }
}
