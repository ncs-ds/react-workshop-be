package com.datasite.react.workshop.be.repository;

import com.datasite.react.workshop.be.model.HelloWorld;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends MongoRepository<HelloWorld, String> {

    HelloWorld findByUserId(String userId);
}
