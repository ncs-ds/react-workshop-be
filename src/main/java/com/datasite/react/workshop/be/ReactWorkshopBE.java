package com.datasite.react.workshop.be;

import com.datasite.react.workshop.be.model.Chair;
import com.datasite.react.workshop.be.model.Desk;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Set;

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
    public void run(String[] args) {
        Chair chair1 = mongoTemplate.save(new Chair());
        Chair chair2 = mongoTemplate.save(new Chair());
        Chair chair3 = mongoTemplate.save(new Chair());
        Chair chair4 = mongoTemplate.save(new Chair());
        Chair chair5 = mongoTemplate.save(new Chair());
        Chair chair6 = mongoTemplate.save(new Chair());
        Chair chair7 = mongoTemplate.save(new Chair());
        Chair chair8 = mongoTemplate.save(new Chair());

        mongoTemplate.save(new Desk(1, 1, Set.of(chair1, chair2)));
        mongoTemplate.save(new Desk(1, 4, Set.of(chair3, chair4, chair5, chair6)));
        mongoTemplate.save(new Desk(4, 1, Set.of(chair7)));
        mongoTemplate.save(new Desk(4, 4, Set.of(chair8)));

    }
}
