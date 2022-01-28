package com.datasite.react.workshop.be.controller;

import com.datasite.react.workshop.be.model.HelloWorld;
import com.datasite.react.workshop.be.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class Controller {

    private final HelloWorldService helloWorldService;

    public Controller(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;

    }

    @GetMapping("/{id}")
    public HelloWorld find(@PathVariable String id) {
        return helloWorldService.getHelloWorld(id);
    }

    @GetMapping()
    public List<HelloWorld> find() {
        return helloWorldService.getAll();
    }

    @PostMapping
    public HelloWorld create(@RequestBody HelloWorld helloWorld) {
        return helloWorldService.saveHelloWorld(helloWorld);
    }
}
