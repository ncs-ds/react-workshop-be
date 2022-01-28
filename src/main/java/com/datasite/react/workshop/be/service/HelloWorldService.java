package com.datasite.react.workshop.be.service;

import com.datasite.react.workshop.be.model.HelloWorld;
import com.datasite.react.workshop.be.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {
    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public HelloWorld getHelloWorld(String userId) {
        return helloWorldRepository.findByUserId(userId);
    }

    public List<HelloWorld> getAll() {
        return helloWorldRepository.findAll();
    }

    public HelloWorld saveHelloWorld(HelloWorld helloWorld) {
        return helloWorldRepository.save(helloWorld);
    }
}
