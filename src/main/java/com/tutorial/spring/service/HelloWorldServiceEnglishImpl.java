package com.tutorial.spring.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"english", "default"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
