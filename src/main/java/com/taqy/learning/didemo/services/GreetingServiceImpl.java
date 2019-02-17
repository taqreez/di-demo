package com.taqy.learning.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public String greet(){
        return "Hello and Welcome to my world!!!";
    }
}
