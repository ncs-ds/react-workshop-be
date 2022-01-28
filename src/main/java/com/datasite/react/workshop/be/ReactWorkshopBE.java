package com.datasite.react.workshop.be;

import com.datasite.react.workshop.be.model.HelloWorld;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ReactWorkshopBE implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    public ReactWorkshopBE(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ReactWorkshopBE.class, args);
    }

    @Override
    public void run(String[] args) throws Exception {
        mongoTemplate.save(new HelloWorld("000000000000000000000001", "test"));
    }
}
